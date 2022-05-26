package services;

import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class ProjectByIdService extends MethodsService {

    public static Response get(String jsonName, Map<String,String> params) {
        return get(jsonName, ProjectResponse.class,params);
    }


}
