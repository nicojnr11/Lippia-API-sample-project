package ar.steps;

import api.model.TimeEntry.GetTimeEntryResponse;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import services.DeleteTimeEntryService;

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
