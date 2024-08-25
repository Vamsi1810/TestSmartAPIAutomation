package Utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ConvertResponseToPOJO {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static <T> T convertResponseStringToObject(String response, Class<T> clas){
        try {
            JsonNode rootNode = objectMapper.readTree(response);
            JsonNode dataNode = rootNode.get("data");
            if(dataNode.isArray()){
                return objectMapper.readValue(dataNode.toString()
                        ,objectMapper.getTypeFactory().constructCollectionType(List.class,clas));
            }
            return objectMapper.treeToValue(dataNode,clas);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
