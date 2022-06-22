package ar.validator;

import api.model.AddTimeEntryResponse;
import api.model.GetTimeEntryResponse;
import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class AddTimeEntryValidator {

    public void validateAddDescription(String description){
        AddTimeEntryResponse response = (AddTimeEntryResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(description,response.getDescription(),"El nombre no fue editado");
    }
}
