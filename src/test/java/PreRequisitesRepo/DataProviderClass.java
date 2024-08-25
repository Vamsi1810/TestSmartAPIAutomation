package PreRequisitesRepo;

import Utils.ConfigLoader;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DataProviderClass {
    @DataProvider
    public Object[][] dataProvider(Method method){
        File file = new File(ConfigLoader.getProperty("testdata.path")+method.getName()+".json");
        ObjectMapper objectMapper = new ObjectMapper();
        try{JsonNode rootNode = objectMapper.readTree(file);
        if(rootNode.isArray()){
            List<Object> objectList = new ArrayList<>();
            for (JsonNode node : rootNode) {
                Map<String, Object> objectMap = objectMapper.convertValue(node,Map.class);
                objectList.add(objectMap);
            }
            Object[][] data = new Object[objectList.size()][1];
            for (int i = 0; i < objectList.size(); i++) {
                data[i][0] = objectList.get(i);
            }
            return data;
        }else{throw new IOException("Given data array was invalid");}}
        catch (Exception e){e.printStackTrace();}
        return null;
    }
}
