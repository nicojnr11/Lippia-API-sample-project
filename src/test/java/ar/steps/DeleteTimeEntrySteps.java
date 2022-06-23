package ar.steps;

import api.model.AddTimeEntryResponse;
import api.model.GetTimeEntryResponse;
import api.model.UpdateTimeEntryResponse;
import ar.validator.UpdateTimeEntryValidator;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.DeleteTimeEntryService;
import services.UpdateTimeEntryService;

import java.util.Arrays;

public class DeleteTimeEntrySteps {


    @And("obtengo el time entry id y paso los parametros workspaceId (.*)")
    public void obtengoElTimeEntryId(String workspaceid){
        GetTimeEntryResponse[] getTimeEntryResponse = (GetTimeEntryResponse[]) APIManager.getLastResponse().getResponse();
        String idtimeentry = Arrays.stream(getTimeEntryResponse).findAny().get().getId();
        DeleteTimeEntryService.TIME_ENTRY_ID.set(idtimeentry);
        DeleteTimeEntryService.WORKSPACE_ID.set(workspaceid);
    }
}
