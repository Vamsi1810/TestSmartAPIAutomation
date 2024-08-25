package Utils;

import Models.Requests.LoginRequest;
import io.restassured.response.Response;
import org.json.JSONObject;

public class GenerateToken {
    public static void fetchToken(){
        String endpoint = "/rest/auth/angelbroking/user/v1/loginByPassword";
        String otp = TOTPGenerator.otpGenerate();
        LoginRequest loginRequest = new LoginRequest(ConfigLoader.getProperty("user.id"),
                ConfigLoader.getProperty("user.password"),otp);

        Response resp = ApiRequestSpecification.getRequestSpecification()
                .when()
                .body(loginRequest)
                .post(ConfigLoader.getProperty("api.root") + endpoint);
        String responseBody = resp.getBody().asString();
        JSONObject jsonObject = new JSONObject(responseBody);
        System.setProperty("jwtToken",jsonObject.getJSONObject("data").getString("jwtToken"));
        System.setProperty("feedToken",jsonObject.getJSONObject("data").getString("feedToken"));
    }
}
