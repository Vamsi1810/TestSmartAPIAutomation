import Models.Requests.MarketDataRequest;
import Models.Responses.MarketData.MarketDataFullResponse;
import Models.Responses.MarketData.MarketDataLTPResponse;
import Models.Responses.MarketData.MarketDataOHLCResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;
import static Utils.ConvertResponseToPOJO.convertResponseStringToObject;
import static org.testng.Assert.assertNotNull;

public class MarketDataTest {
    private String endpoint = "/rest/secure/angelbroking/market/v1/quote/";
    @Test
    public void testLTPData(){
        MarketDataRequest marketDataLTPRequest = new MarketDataRequest("LTP",
                new MarketDataRequest.ExchangeTokens(new String[]{"3045"}));
        Response response = getResponseBasedOnRequest(endpoint,"POST",marketDataLTPRequest);
        MarketDataLTPResponse marketDataLTPResponse = convertResponseStringToObject(response.asString(), MarketDataLTPResponse.class);
        assertNotNull(marketDataLTPResponse,"MarketData LTP Reponse was empty");
        System.out.println(response.asPrettyString());
    }
    @Test
    public void testOHLC(){
        MarketDataRequest marketDataLTPRequest = new MarketDataRequest("OHLC",
                new MarketDataRequest.ExchangeTokens(new String[]{"3045"}));
        Response response = getResponseBasedOnRequest(endpoint,"POST",marketDataLTPRequest);
        MarketDataOHLCResponse marketDataOHLCResponse = convertResponseStringToObject(response.asString(), MarketDataOHLCResponse.class);
        assertNotNull(marketDataOHLCResponse,"MarketData OHLC data was empty");
        System.out.println(response.asPrettyString());
    }
    @Test
    public void testFullMode(){
        MarketDataRequest marketDataLTPRequest = new MarketDataRequest("FULL",
                new MarketDataRequest.ExchangeTokens(new String[]{"3045"}));
        Response response = getResponseBasedOnRequest(endpoint,"POST",marketDataLTPRequest);
        MarketDataFullResponse marketDataFullResponse = convertResponseStringToObject(response.asString(), MarketDataFullResponse.class);
        assertNotNull(marketDataFullResponse,"Market Data Full response was invalid");
        System.out.println(response.asPrettyString());
    }
}
