import Models.Requests.LTPDataRequest;
import Models.Requests.OrderRequest;
import Models.Responses.Orders.*;
import PreRequisitesRepo.DataProviderClass;
import PreRequisitesRepo.DeSerializer;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static PreRequisitesRepo.FetchTokenForScript.fetchTokenByScripName;
import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;
import static Utils.ConvertResponseToPOJO.convertResponseStringToObject;
import static org.testng.Assert.assertNotNull;

public class OrderTest {
    @Test(priority = 1,dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testPlaceOrder(Object object){
        String endpoint = "/rest/secure/angelbroking/order/v1/placeOrder";
        OrderRequest orderRequest = DeSerializer.deserializeObject(object, OrderRequest.class);
        orderRequest.setSymboltoken(fetchTokenByScripName(orderRequest.getExchange(), orderRequest.getTradingsymbol()));
        Response response = getResponseBasedOnRequest(endpoint,"POST",orderRequest);
        OrderResponse orderResponse = convertResponseStringToObject(response.asString(), OrderResponse.class);
        assertNotNull(orderResponse,"Order Response details are empty");
        System.out.println(response.asPrettyString());
    }
    @Test(priority = 2,dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testModifyOrder(Object object){
        String endpoint = "/rest/secure/angelbroking/order/v1/placeOrder";
        OrderRequest orderRequest = DeSerializer.deserializeObject(object, OrderRequest.class);
        orderRequest.setSymboltoken(fetchTokenByScripName(orderRequest.getExchange(), orderRequest.getTradingsymbol()));
        Response response = getResponseBasedOnRequest(endpoint,"POST",orderRequest);

        orderRequest.setOrderid(response.jsonPath().getString("data.orderid"));
        orderRequest.setQuantity("4");

        String modifyOrderEndpoint = "/rest/secure/angelbroking/order/v1/modifyOrder";
        Response modifyOrderResponse = getResponseBasedOnRequest(modifyOrderEndpoint,"POST",orderRequest);
        OrderResponse orderResponse = convertResponseStringToObject(modifyOrderResponse.asString(), OrderResponse.class);
        assertNotNull(orderResponse,"Modify order not executed");
        System.out.println(response.asPrettyString());
    }
    @Test(priority = 3,dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testCancelOrder(Object object){
        String endpoint = "/rest/secure/angelbroking/order/v1/placeOrder";
        OrderRequest orderRequest = DeSerializer.deserializeObject(object, OrderRequest.class);
        orderRequest.setSymboltoken(fetchTokenByScripName(orderRequest.getExchange(), orderRequest.getTradingsymbol()));
        Response response = getResponseBasedOnRequest(endpoint,"POST",orderRequest);

        String cancelOrderendpoint = "/rest/secure/angelbroking/order/v1/cancelOrder";
        OrderRequest cancelOrder = new OrderRequest(response.jsonPath().getString("data.orderid"), orderRequest.getVariety());
        Response cancelorderresponse = getResponseBasedOnRequest(cancelOrderendpoint,"POST",cancelOrder);
        OrderResponse cancelOrderResponse = convertResponseStringToObject(cancelorderresponse.asString(), OrderResponse.class);
        assertNotNull(cancelOrderResponse,"Cancel order was not successful");
        System.out.println(cancelorderresponse.asPrettyString());
    }
    @Test(priority = 4)
    public void testGetOrderBookData(){
        String endpoint = "/rest/secure/angelbroking/order/v1/getOrderBook";
        Response response = getResponseBasedOnRequest(endpoint,"GET");
        List<OrderBookResponse> orderBoookResponse = (List<OrderBookResponse>) convertResponseStringToObject(response.asString(), OrderBookResponse.class);
        assertNotNull(orderBoookResponse,"Order Response was empty");
        System.out.println(response.asPrettyString());
    }
    @Test(priority = 5)
    public void testGetTradeBookResponse(){
        String endpoint = "/rest/secure/angelbroking/order/v1/getTradeBook";
        Response response = getResponseBasedOnRequest(endpoint,"GET");
        List<TradeBookResponse> tradeBookResponses = (List<TradeBookResponse>) convertResponseStringToObject(response.asString(),TradeBookResponse.class);
        assertNotNull(tradeBookResponses,"Trade Book Response was Empty\n");
        System.out.println(response.asString());
    }
    @Test(priority = 6, dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testGetLtpData(Object object){
        String endpoint = "/rest/secure/angelbroking/order/v1/getLtpData";
        LTPDataRequest ltpDataRequest = DeSerializer.deserializeObject(object, LTPDataRequest.class);
        ltpDataRequest.setSymbolToken(fetchTokenByScripName(ltpDataRequest.getExchange(), ltpDataRequest.getTradingSymbol()));
        Response response = getResponseBasedOnRequest(endpoint,"POST",ltpDataRequest);
        LTPDataResponse ltpDataResponse = convertResponseStringToObject(response.asString(), LTPDataResponse.class);
        assertNotNull(ltpDataResponse,"LTP Data Response was empty");
        System.out.println(response.asPrettyString());
    }
    @Test(priority = 7, dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testIndividualOrderStatus(Object object){
        String individualOrderendpoint = "/rest/secure/angelbroking/order/v1/details/";
        class PathParam{
            String pathParam;
            public PathParam(String pathparam){
                this.pathParam = pathparam;
            }
            public String toString(){
                return pathParam;
            }
        }
        String endpoint = "/rest/secure/angelbroking/order/v1/placeOrder";
        OrderRequest orderRequest = DeSerializer.deserializeObject(object, OrderRequest.class);
        orderRequest.setSymboltoken(fetchTokenByScripName(orderRequest.getExchange(), orderRequest.getTradingsymbol()));
        Response response = getResponseBasedOnRequest(endpoint,"POST",orderRequest);

        PathParam params = new PathParam(response.jsonPath().getString("data.uniqueorderid"));
        Response invidualOrderresponse = getResponseBasedOnRequest(individualOrderendpoint,"GET",params);
        IndividualOrderStatusResponse orderStatusResponse = convertResponseStringToObject(invidualOrderresponse.asString(), IndividualOrderStatusResponse.class);
        assertNotNull(orderStatusResponse,"Order Response Status was empty");
        System.out.println(invidualOrderresponse.asPrettyString());
    }
}
