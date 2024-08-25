import Models.Requests.LoginRequest;
import Models.Requests.LogoutRequest;
import Models.Responses.user.LoginResponse;
import Models.Responses.user.ProfileResponse;
import Models.Responses.user.RMSResponse;
import Utils.ConfigLoader;
import Utils.ConvertResponseToPOJO;
import Utils.TOTPGenerator;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;
import static Utils.ConvertResponseToPOJO.*;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertNotNull;

public class UserTest {
    @Test
    public void loginTest(){
        String endpoint = "/rest/auth/angelbroking/user/v1/loginByPassword";
        String otp = TOTPGenerator.otpGenerate();

        LoginRequest loginRequest = new LoginRequest(ConfigLoader.getProperty("user.id"),
                ConfigLoader.getProperty("user.password"),otp);

        Response response = getResponseBasedOnRequest(endpoint,"POST",loginRequest);

        LoginResponse loginResponse = ConvertResponseToPOJO.convertResponseStringToObject(response.asString(), LoginResponse.class);
        assertNotNull(loginResponse, "LoginResponse is null");
        System.out.println(response.asPrettyString());
    }
    @Test
    public void getProfileDetails(){
        String endpoint = "/rest/secure/angelbroking/user/v1/getProfile";
        Response response = getResponseBasedOnRequest(endpoint,"GET");
        ProfileResponse profileResponse = convertResponseStringToObject(response.asString(), ProfileResponse.class);
        assertNotNull(profileResponse, "profile Response is null");
        System.out.println(response.asPrettyString());
    }

    @Test
    public void getRMSLimit(){
        String endpoint = "/rest/secure/angelbroking/user/v1/getRMS";
        Response response = getResponseBasedOnRequest(endpoint,"GET");
        RMSResponse rmsResponse = convertResponseStringToObject(response.asString(), RMSResponse.class);
        assertNotNull(rmsResponse,"RMS Response is null");
        System.out.println(response.asPrettyString());
    }

    @Test
    public void checkLogout(){
        String endPoint = "/rest/secure/angelbroking/user/v1/logout";
        LogoutRequest clientCode = new LogoutRequest(ConfigLoader.getProperty("user.id"));
        Response response = getResponseBasedOnRequest(endPoint,"POST",clientCode);
        response.then().statusCode(200).body("data",equalTo("Logout Successfully"));
        System.out.println(response.asPrettyString());
    }
}
