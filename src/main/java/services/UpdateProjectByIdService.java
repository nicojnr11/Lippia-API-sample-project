package services;

import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.Map;

public class UpdateProjectByIdService extends MethodsService {

    public static Response put(String jsonName, Map<String,String> params) {
        return put(jsonName, ProjectResponse.class,params);
    }


}
