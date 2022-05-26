package services;

import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.Map;

public class ProjectService extends MethodsService {

    public static Response get(String jsonName) {
        return get(jsonName, ProjectResponse[].class);
    }

    public static Response get(String jsonName, Map<String,String> params) {
        return get(jsonName, ProjectResponse[].class,params);
    }

    public static Response put(String jsonName) {
        return put(jsonName, ProjectResponse.class);
    }
}
