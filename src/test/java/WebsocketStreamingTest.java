import Models.Requests.WebsocketRequest;
import Utils.ConfigLoader;
import Utils.GenerateToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.util.concurrent.CountDownLatch;

public class WebsocketStreamingTest {
    public static void main(String args[]){
        OkHttpClient client = new OkHttpClient();
        GenerateToken.fetchToken();
        //Keeps the program running until a message is received or an error occur
        CountDownLatch latch = new CountDownLatch(1);
        String endpoint = "wss://smartapisocket.angelone.in/smart-stream";
        Request request = new Request.Builder()
                .url(endpoint+"?clientCode="+ConfigLoader.getProperty("user.id")
                        +"&feedToken="+System.getProperty("feedToken")
                        +"&apiKey="+ConfigLoader.getProperty("api.key")).build();
        WebSocketListener listener = new WebSocketListener() {
            @Override
            public void onOpen(WebSocket webSocket, Response response) {
                WebsocketRequest websocketRequest = new WebsocketRequest(
                        1,new WebsocketRequest.Params(1,
                        new WebsocketRequest.Params.Token[]{
                                new WebsocketRequest.Params.Token(1,
                                        new String[]{"10626"})})
                );
                System.out.println("Connection opened");
                ObjectMapper objectMapper = new ObjectMapper();
                try {
                    webSocket.send(objectMapper.writeValueAsString(websocketRequest));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onMessage(WebSocket webSocket, String text) {
                System.out.println("Received message: " + text); // Print the received message
                latch.countDown(); // Decrement the latch to signal we're done
            }

            @Override
            public void onClosing(WebSocket webSocket, int code, String reason) {
                System.out.println("Connection closing: " + reason);
                webSocket.close(1000, null); // Close the WebSocket
            }

            @Override
            public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                System.out.println("Error: " + t.getMessage()); // Print any errors
                latch.countDown(); // Decrement the latch on failure
            }
        };
        // Establish the WebSocket connection
        client.newWebSocket(request, listener);

        // Wait for the response or connection close
        try {
            latch.await(); // Wait until the latch is counted down
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Clean up and shut down the client
        client.dispatcher().executorService().shutdown();
    }
}
