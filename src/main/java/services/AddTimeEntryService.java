package services;

import api.model.TimeEntry.AddTimeEntryResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.Map;

public class AddTimeEntryService extends MethodsService {

    public static Response post(String jsonName, Map<String,String> params) {
        return post(jsonName, AddTimeEntryResponse.class, params);
    }


}
