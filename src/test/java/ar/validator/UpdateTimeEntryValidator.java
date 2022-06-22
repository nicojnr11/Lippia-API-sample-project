package ar.validator;

import api.model.AddTimeEntryResponse;
import api.model.UpdateTimeEntryResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class UpdateTimeEntryValidator {

    public void validateUpdateDescription(String description){
        UpdateTimeEntryResponse response = (UpdateTimeEntryResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(description,response.getDescription(),"El nombre no fue editado");
    }
}
