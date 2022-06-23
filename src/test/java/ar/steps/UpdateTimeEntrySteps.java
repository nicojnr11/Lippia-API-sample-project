package ar.steps;

import api.model.TimeEntry.AddTimeEntryResponse;
import api.model.TimeEntry.GetTimeEntryResponse;
import ar.validator.UpdateTimeEntryValidator;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.UpdateTimeEntryService;

import java.util.Arrays;

public class UpdateTimeEntrySteps {

    UpdateTimeEntryValidator validator = new UpdateTimeEntryValidator();

    @And("obtengo el time entry id y paso los parametros projectId (.*) workspaceId (.*) description (.*)")
    public void obtengoElTimeEntryId(String projectid, String workspaceid, String description){
        GetTimeEntryResponse[] getTimeEntryResponse = (GetTimeEntryResponse[]) APIManager.getLastResponse().getResponse();
        String idtimeentry = Arrays.stream(getTimeEntryResponse).findAny().get().getId();
        UpdateTimeEntryService.TIME_ENTRY_ID.set(idtimeentry);
        UpdateTimeEntryService.PROJECT_ID.set(projectid);
        UpdateTimeEntryService.WORKSPACE_ID.set(workspaceid);
        UpdateTimeEntryService.DESCRIPTION_ID.set(description);
    }

    @Then("^se valida la descripcion '(.*)' en el update time entry$")
    public void seValidaElCambioDeNombreEnElProject(String descripcion) {
        validator.validateUpdateDescription(descripcion);
    }
}
