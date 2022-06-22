package ar.steps;

import api.model.AddTimeEntryResponse;
import api.model.UpdateTimeEntryResponse;
import ar.validator.UpdateTimeEntryValidator;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.DeleteTimeEntryService;
import services.UpdateTimeEntryService;

public class DeleteTimeEntrySteps {


    @And("obtengo el time entry id y paso los parametros workspaceId (.*)")
    public void obtengoElTimeEntryId(String workspaceid){
        UpdateTimeEntryResponse updateTimeEntryResponse = (UpdateTimeEntryResponse) APIManager.getLastResponse().getResponse();
        DeleteTimeEntryService.TIME_ENTRY_ID.set(updateTimeEntryResponse.getId());
        DeleteTimeEntryService.WORKSPACE_ID.set(workspaceid);
    }
}
