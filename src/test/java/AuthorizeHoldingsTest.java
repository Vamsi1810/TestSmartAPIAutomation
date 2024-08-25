import Models.Requests.AuthorizeRequest;
import Models.Requests.AuthorizeRequestBody;
import Models.Requests.TpinRequest;
import Models.Responses.HoldingAuthorization.AuthorizationResponse;
import PreRequisitesRepo.DataProviderClass;
import PreRequisitesRepo.DeSerializer;
import Utils.ConfigLoader;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;
import static Utils.ConvertResponseToPOJO.convertResponseStringToObject;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class AuthorizeHoldingsTest {
    public String reqid;
    @Test(dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testAuthorization(Object object){
        String endpoint = "/rest/secure/angelbroking/edis/v1/verifyDis";
        AuthorizeRequest authorize = DeSerializer.deserializeObject(object, AuthorizeRequest.class);
        Response response = getResponseBasedOnRequest(endpoint,"POST",authorize);
        reqid = response.jsonPath().getString("data.ReqId");
        AuthorizationResponse authorizationResponse = convertResponseStringToObject(response.asString(), AuthorizationResponse.class);
        assertNotNull(authorizationResponse,"Authorization data was empty");
        System.out.println(response.asPrettyString());
    }
    @Test(dependsOnMethods = {"testAuthorization"})
    public void testGenerateTpin(){
        String endpoint = "/rest/secure/angelbroking/edis/v1/generateTPIN";
        TpinRequest tpinRequest = new TpinRequest(ConfigLoader.getProperty("user.dpid"),reqid,ConfigLoader.getProperty("user.boid"), ConfigLoader.getProperty("user.pan"));
        Response response = getResponseBasedOnRequest(endpoint, "POST",tpinRequest);
        assertTrue(response.jsonPath().getString("body")==null,"tpinGeneration Failed");
        System.out.println(response.asPrettyString());
    }

    @Test(dependsOnMethods = {"testAuthorization"})
    public void testTransactionStatus(){
        String endpoint = "/rest/secure/angelbroking/edis/v1/getTranStatus";
        AuthorizeRequestBody requestBody = new AuthorizeRequestBody(reqid);
        Response response = getResponseBasedOnRequest(endpoint,"POST",requestBody);
        System.out.println(response.asPrettyString());
    }
}
