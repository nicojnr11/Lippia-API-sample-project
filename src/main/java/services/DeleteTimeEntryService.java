package services;

import api.model.UpdateTimeEntryResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class DeleteTimeEntryService extends MethodsService {

    public static final ThreadLocal<String> TIME_ENTRY_ID = new ThreadLocal<String>();
    public static final ThreadLocal<String> WORKSPACE_ID = new ThreadLocal<String>();

    public static Response delete(String jsonName) {
        return delete(jsonName, null, setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("idTimeEntry",TIME_ENTRY_ID.get());
        params.put("workspaceId", WORKSPACE_ID.get());
        return params;
    }
}
