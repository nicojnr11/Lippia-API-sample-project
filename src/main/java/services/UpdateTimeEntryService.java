package services;

import api.model.TimeEntry.UpdateTimeEntryResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;


import java.util.HashMap;
import java.util.Map;


public class UpdateTimeEntryService extends MethodsService {

    public static final ThreadLocal<String> TIME_ENTRY_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> WORKSPACE_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> DESCRIPTION_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> PROJECT_ID = new ThreadLocal<String>();

    public static Response put(String jsonName) {
        return put(jsonName, UpdateTimeEntryResponse.class, setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("idTimeEntry",TIME_ENTRY_ID.get());
        params.put("description", DESCRIPTION_ID.get());
        params.put("projectId", PROJECT_ID.get());
        params.put("workspaceId", WORKSPACE_ID.get());
        return params;
    }
}
