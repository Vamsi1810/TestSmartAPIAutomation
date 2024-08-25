import Models.Requests.BrokerageForOrders;
import Models.Responses.Brokerage.BrokerageCalculatorResponse;
import PreRequisitesRepo.DataProviderClass;
import PreRequisitesRepo.DeSerializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static PreRequisitesRepo.FetchTokenForScript.fetchTokenByScripName;
import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;
import static Utils.ConvertResponseToPOJO.convertResponseStringToObject;
import static org.testng.Assert.assertNotNull;

public class BrokerageCalculatorTest {
    @Test(dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testBrokerageResponse(Object object) throws JsonProcessingException {
        String endpoint = "/rest/secure/angelbroking/brokerage/v1/estimateCharges";
        BrokerageForOrders orders= DeSerializer.deserializeObject(object, BrokerageForOrders.class);
        orders.getOrders()[0].setToken(fetchTokenByScripName(orders.getOrders()[0].getExchange(),orders.getOrders()[0].getSymbol_name()));
        orders.getOrders()[1].setToken(fetchTokenByScripName(orders.getOrders()[1].getExchange(),orders.getOrders()[1].getSymbol_name()));
        Response response = getResponseBasedOnRequest(endpoint,"POST",orders);
        BrokerageCalculatorResponse brokerageCalculatorResponse = convertResponseStringToObject(response.asString(), BrokerageCalculatorResponse.class);
        assertNotNull(brokerageCalculatorResponse,"Brokerage Response was null");
        System.out.println(response.asPrettyString());
    }
}
