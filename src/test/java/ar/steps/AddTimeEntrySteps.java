package ar.steps;

import ar.validator.AddTimeEntryValidator;
import ar.validator.GetTimeEntryValidator;
import io.cucumber.java.en.Then;

public class AddTimeEntrySteps {

    AddTimeEntryValidator validator = new AddTimeEntryValidator();

    @Then("^se valida la descripcion '(.*)' en el add time entry$")
    public void seValidaElCambioDeNombreEnElProject(String descripcion) {
        validator.validateAddDescription(descripcion);
    }
}
