import Models.Requests.HistoricalApiRequest;
import PreRequisitesRepo.DataProviderClass;
import PreRequisitesRepo.DeSerializer;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.isA;

public class HistoricalApiTest {
    @Test(dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testHistoricalApiResponse(Object object){
        String endpoint = "/rest/secure/angelbroking/historical/v1/getCandleData";
        HistoricalApiRequest historicalApiRequest = DeSerializer.deserializeObject(object, HistoricalApiRequest.class);
        Response response = getResponseBasedOnRequest(endpoint,"POST",historicalApiRequest);
        response.then().body("data",isA(ArrayList.class))
                .body("data[0][0]",isA(String.class))
                .body("data[0][1]",isA(Float.class))
                .body("data[0][2]",isA(Float.class))
                .body("data[0][3]",isA(Float.class))
                .body("data[0][4]",isA(Float.class))
                .body("data[0][5]",isA(Integer.class));
        System.out.println(response.asPrettyString());
    }
}
