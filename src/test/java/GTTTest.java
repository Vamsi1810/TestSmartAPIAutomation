import Models.Requests.GTTRuleRequest;
import PreRequisitesRepo.DataProviderClass;
import PreRequisitesRepo.DeSerializer;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static PreRequisitesRepo.FetchTokenForScript.fetchTokenByScripName;
import Models.Responses.GTT.GTTResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;
import static Utils.ConvertResponseToPOJO.convertResponseStringToObject;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class GTTTest {
    private int orderId;
    private String exchange = "NSE";
    private String scrip = "SBIN-EQ";
    @Test(priority = 1,dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testCreateRule(Object object) throws IOException {
        GTTRuleRequest createRuleRequest = DeSerializer.deserializeObject(object, GTTRuleRequest.class);
        createRuleRequest.setSymboltoken(fetchTokenByScripName(createRuleRequest.getExchange(),createRuleRequest.gettradingsymbol()));
        String endpoint = "/rest/secure/angelbroking/gtt/v1/createRule";
        Response response = getResponseBasedOnRequest(endpoint,"POST",createRuleRequest);
        response.then().body("data.id",instanceOf(Integer.class));
        orderId = (response.jsonPath().getInt("data.id"));
        System.out.println(response.asPrettyString());
    }
    @Test(priority = 2,dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class,dependsOnMethods = {"testCreateRule"})
    public void testModifyRule(Object object){
        String endpoint = "/rest/secure/angelbroking/gtt/v1/modifyRule";
        assertTrue(orderId>0,"Order id is invalid");
        GTTRuleRequest modifyRuleRequest = DeSerializer.deserializeObject(object, GTTRuleRequest.class);
        modifyRuleRequest.setId(String.valueOf(orderId));
        modifyRuleRequest.setSymboltoken(fetchTokenByScripName(exchange,scrip));
        Response response = getResponseBasedOnRequest(endpoint,"POST",modifyRuleRequest);
        response.then().body("data.id",equalTo(orderId));
        System.out.println(response.asPrettyString());
    }
    @Test(priority = 3, dependsOnMethods = {"testCreateRule"})
    public void fetchGTTRuleDetails(){
        String endpoint = "/rest/secure/angelbroking/gtt/v1/ruleDetails";
        GTTRuleRequest fetchRule = new GTTRuleRequest(String.valueOf(orderId));
        Response response = getResponseBasedOnRequest(endpoint, "POST",fetchRule);
        GTTResponse gttResponse = convertResponseStringToObject(response.asString(),GTTResponse.class);
        assertNotNull(gttResponse,"GTT Response was null");
        System.out.println(response.asPrettyString());
    }
    @Test(priority = 4,dependsOnMethods = {"testCreateRule"})
    public void cancelGTTRule(){
        String endpoint = "/rest/secure/angelbroking/gtt/v1/cancelRule";
        GTTRuleRequest fetchRule = new GTTRuleRequest(String.valueOf(orderId),fetchTokenByScripName(exchange,scrip),exchange);
        Response response = getResponseBasedOnRequest(endpoint, "POST",fetchRule);
        response.then().body("data.id",equalTo(orderId));
        System.out.println(response.asPrettyString());
    }
    @Test(priority = 5,dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class,dependsOnMethods = {"testCreateRule"})
    public void getRuleList(Object object){
        String endpoint = "/rest/secure/angelbroking/gtt/v1/ruleList";
        GTTRuleRequest getRuleList = DeSerializer.deserializeObject(object, GTTRuleRequest.class);
        Response response = getResponseBasedOnRequest(endpoint, "POST",getRuleList);
        List<GTTResponse> gttResponse = (List<GTTResponse>) convertResponseStringToObject(response.asString(), GTTResponse.class);
        assertNotNull(gttResponse,"GTT Orders are empty");
        System.out.println(response.asPrettyString());
    }
}
