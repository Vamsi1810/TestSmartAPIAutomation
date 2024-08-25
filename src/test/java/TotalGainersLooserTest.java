import Models.Requests.OptionGreekRequest;
import Models.Requests.TopLooserGainerRequest;
import Models.Responses.TopLooserGainers.PCRVolumeResponse;
import Models.Responses.TopLooserGainers.TopLooserGainerResponse;
import PreRequisitesRepo.DataProviderClass;
import PreRequisitesRepo.DeSerializer;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static Utils.ApiRequestSpecification.getResponseBasedOnRequest;
import static Utils.ConvertResponseToPOJO.convertResponseStringToObject;
import static org.testng.Assert.assertNotNull;

public class TotalGainersLooserTest {
    @Test(dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testPercOIGainers_Near(Object object){
        String endpoint = "/rest/secure/angelbroking/marketData/v1/gainersLosers";
        TopLooserGainerRequest topLooserGainerRequest = DeSerializer.deserializeObject(object, TopLooserGainerRequest.class);
        Response response = getResponseBasedOnRequest(endpoint,"POST",topLooserGainerRequest);
        List<TopLooserGainerResponse> topLooserGainerResponses = (List<TopLooserGainerResponse>)convertResponseStringToObject(response.asString(),TopLooserGainerResponse.class);
        assertNotNull(topLooserGainerResponses,"Looser Gainers Response was Invalid");
        System.out.println(response.asPrettyString());
    }
    @Test
    public void testPCRVolume(){
        String endpoint = "/rest/secure/angelbroking/marketData/v1/putCallRatio";
        Response response = getResponseBasedOnRequest(endpoint,"GET");
        List<PCRVolumeResponse> pcrVolumeResponse = (List<PCRVolumeResponse>)convertResponseStringToObject(response.asString(), PCRVolumeResponse.class);
        assertNotNull(pcrVolumeResponse,"PCR Volume Response was Invalid");
        System.out.println(response.asPrettyString());
    }
    @Test(dataProvider = "dataProvider",dataProviderClass = DataProviderClass.class)
    public void testOIBuildup(Object object){
        String endpoint = "/rest/secure/angelbroking/marketData/v1/OIBuildup";
        TopLooserGainerRequest topLooserGainerRequest = DeSerializer.deserializeObject(object, TopLooserGainerRequest.class);
        Response response = getResponseBasedOnRequest(endpoint,"POST",topLooserGainerRequest);
        List<TopLooserGainerResponse> topLooserGainerResponse = (List<TopLooserGainerResponse>)convertResponseStringToObject(response.asString(), TopLooserGainerResponse.class);
        assertNotNull(topLooserGainerResponse,"OI Buildup response was invalid");
        System.out.println(response.asPrettyString());
    }
}
