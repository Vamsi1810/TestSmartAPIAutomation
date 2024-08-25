package PreRequisitesRepo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class DeSerializer {
    public static <T> T deserializeObject(Object object, Class<T> clazz){
        Gson gson = new Gson();
        ObjectMapper objectMapper = new ObjectMapper();
        try{return gson.fromJson(objectMapper.writeValueAsString(object),clazz);}
        catch (Exception e){e.printStackTrace();}
        return null;
    }
}
