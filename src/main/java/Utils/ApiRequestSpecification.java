package Utils;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static Utils.GenerateToken.fetchToken;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiRequestSpecification {
    static {
        fetchToken();
    }
    public static RequestSpecification getRequestSpecification(){
        return given().contentType("application/json")
                .accept("application/json")
                .header("X-UserType", "USER")
                .header("X-SourceID", "WEB")
                .header("X-PrivateKey", ConfigLoader.getProperty("api.key"))
                .header("X-ClientLocalIP", NetworkUtils.getLocalIP())
                .header("X-ClientPublicIP", NetworkUtils.getPublicIP())
                .header("X-MACAddress", NetworkUtils.getMACAddress());
    }
    public static Response getResponseBasedOnRequest(String endpoint, String requestType,Object... object){
        RequestSpecification requestSpecification = given().contentType("application/json")
                .accept("application/json")
                .header("X-UserType", "USER")
                .header("X-SourceID", "WEB")
                .header("X-PrivateKey", ConfigLoader.getProperty("api.key"))
                .header("X-ClientLocalIP", NetworkUtils.getLocalIP())
                .header("X-ClientPublicIP", NetworkUtils.getPublicIP())
                .header("X-MACAddress", NetworkUtils.getMACAddress())
        .header("Authorization","Bearer "+System.getProperty("jwtToken"));
        switch(requestType){
            case "GET":
                String path_param;
                String url;
                if(object!=null && object.length > 0) {
                    path_param = object[0].toString();
                    url = ConfigLoader.getProperty("api.root") + endpoint + path_param;
                }
                else url = ConfigLoader.getProperty("api.root") + endpoint;
                return requestSpecification.get(url).then()
                        .body("status",equalTo(true))
                        .body("message",equalTo("SUCCESS"))
                        .statusCode(200)
                        .extract().response();
            case "POST":
                return requestSpecification.body(object[0])
                        .post(ConfigLoader.getProperty("api.root") + endpoint).then()
                        .statusCode(200)
                        .body("status",equalTo(true))
                        .body("message",equalTo("SUCCESS"))
                        .extract().response();
            case "PUT":
                return requestSpecification.body(object).put(ConfigLoader.getProperty("api.root") + endpoint).then()
                        .statusCode(200)
                        .body("status",equalTo(true))
                        .body("message",equalTo("SUCCESS"))
                        .extract().response();
            case "DELETE":
                return requestSpecification.body(object).put(ConfigLoader.getProperty("api.root") + endpoint).then()
                        .statusCode(200)
                        .body("status",equalTo(true))
                        .body("message",equalTo("SUCCESS"))
                        .extract().response();
            default:
                return null;
        }
    }
}
