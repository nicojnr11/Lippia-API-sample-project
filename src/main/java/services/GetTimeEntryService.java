package services;

import api.model.GetTimeEntryResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.Map;

public class GetTimeEntryService extends MethodsService {

    public static Response get(String jsonName, Map<String,String> params) {
        return get(jsonName, GetTimeEntryResponse[].class, params);
    }


}
