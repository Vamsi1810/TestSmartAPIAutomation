import Models.Requests.BrokerageForOrders;
import Models.Requests.ConvertPositionRequest;
import Models.Responses.Portfolio.GetAllHoldingsResponse;
import Models.Responses.Portfolio.PortfolioResponse;
import Models.Responses.Portfolio.PositionInfoResponse;
import PreRequisitesRepo.DataProviderClass;
import PreRequisitesRepo.DeSerializer;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;
import static Utils.ConvertResponseToPOJO.convertResponseStringToObject;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class PortfolioTest {
    @Test
    public void testGetHolding(){
        String endpoint = "/rest/secure/angelbroking/portfolio/v1/getHolding";
        Response response = getResponseBasedOnRequest(endpoint,"GET");
        List<PortfolioResponse> portfolioResponse = (List<PortfolioResponse>)convertResponseStringToObject(response.asString(), PortfolioResponse.class);
        assertNotNull(portfolioResponse,"Portfolio response was empty");
        System.out.println(response.asPrettyString());
    }
    @Test
    public void testGetAllHoldings(){
        String endpoint = "/rest/secure/angelbroking/portfolio/v1/getAllHolding";
        Response response = getResponseBasedOnRequest(endpoint,"GET");
        GetAllHoldingsResponse getAllHoldingsResponse = convertResponseStringToObject(response.asString(), GetAllHoldingsResponse.class);
        assertNotNull(getAllHoldingsResponse,"All Holdings response was not empty");
        System.out.println(response.asPrettyString());
    }
    // Positions data can be null, if no positions were taken
    @Test
    public void testGetPositionInfo(){
        String endpoint = "/rest/secure/angelbroking/order/v1/getPosition";
        Response response = getResponseBasedOnRequest(endpoint,"GET");
        PositionInfoResponse positionInfoResponse = convertResponseStringToObject(response.asString(), PositionInfoResponse.class);
        assertTrue(response.jsonPath().getString("body")==null || positionInfoResponse!=null,"Unexpected positions response");
        System.out.println(response.asPrettyString());
    }
    @Test(dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testConvertPosition(Object object){
        String endpoint = "/rest/secure/angelbroking/order/v1/convertPosition";
        ConvertPositionRequest convertPositionRequest = DeSerializer.deserializeObject(object, ConvertPositionRequest.class);
        Response response = getResponseBasedOnRequest(endpoint,"POST",convertPositionRequest);
        System.out.println(response.asPrettyString());
    }

}
