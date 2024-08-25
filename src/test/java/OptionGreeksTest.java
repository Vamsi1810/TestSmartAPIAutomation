import Models.Requests.OptionGreekRequest;
import Models.Responses.OptionGreeks.OptionGreeksResponse;
import PreRequisitesRepo.DataProviderClass;
import PreRequisitesRepo.DeSerializer;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.List;

import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;
import static Utils.ConvertResponseToPOJO.convertResponseStringToObject;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertNotNull;

public class OptionGreeksTest {
    @Test(dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testOptionGreeks(Object object){
        String endpoint = "/rest/secure/angelbroking/marketData/v1/optionGreek";
        OptionGreekRequest optionGreekRequest = DeSerializer.deserializeObject(object, OptionGreekRequest.class);
        Response response = getResponseBasedOnRequest(endpoint,"POST",optionGreekRequest);
        assert response != null;
        response.then().body("data.optionType", everyItem(anyOf(equalTo("CE"), equalTo("PE"))));
        List<OptionGreeksResponse> optionGreeksResponse = (List<OptionGreeksResponse>)convertResponseStringToObject(response.asString(), OptionGreeksResponse.class);
        assertNotNull(optionGreeksResponse,"Option Greek Response was invalid");
        System.out.println(response.asPrettyString());
    }
}
