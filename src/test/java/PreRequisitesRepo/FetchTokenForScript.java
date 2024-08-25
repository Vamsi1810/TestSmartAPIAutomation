package PreRequisitesRepo;

import Models.Requests.ScripTokenRequest;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;

public class FetchTokenForScript {
    public static String fetchTokenByScripName(String exchange, String scrip){
        String endpoint = "/rest/secure/angelbroking/order/v1/searchScrip";
        ScripTokenRequest scripTokenRequest = new ScripTokenRequest(exchange,scrip);

        Response response = getResponseBasedOnRequest(endpoint,"POST",scripTokenRequest);
        JSONObject jsonObject = new JSONObject(response.asString());
        JSONArray dataArray = jsonObject.getJSONArray("data");

        for(int i=0; i<dataArray.length();i++){
            JSONObject item = dataArray.getJSONObject(i);
            if(item.getString("tradingsymbol").equals(scrip.toUpperCase())){
                return item.getString("symboltoken");
            }
        }
        return "";
    }
}
