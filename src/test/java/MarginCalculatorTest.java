import Models.Requests.MarginCalculatorRequest;
import Models.Responses.MarginCalculator.MarginCalculatorResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;
import static Utils.ConvertResponseToPOJO.convertResponseStringToObject;
import static org.testng.Assert.assertNotNull;

public class MarginCalculatorTest {
    @Test
    public void testMarginCalculator(){
        String endpoint = "/rest/secure/angelbroking/margin/v1/batch";
        MarginCalculatorRequest marginCalculatorRequest = new MarginCalculatorRequest(
          new MarginCalculatorRequest.Position[]{new MarginCalculatorRequest.Position("NSE",50,1000,"INTRADAY","3045","BUY"),
          new MarginCalculatorRequest.Position("NSE",50,1100,"INTRADAY","3045","BUY")
        });
        Response response = getResponseBasedOnRequest(endpoint,"POST",marginCalculatorRequest);
        MarginCalculatorResponse marginCalculatorResponse = convertResponseStringToObject(response.asString(), MarginCalculatorResponse.class);
        assertNotNull(marginCalculatorResponse,"Margin Calculator Response was empty");
        System.out.println(response.asPrettyString());
    }
}
