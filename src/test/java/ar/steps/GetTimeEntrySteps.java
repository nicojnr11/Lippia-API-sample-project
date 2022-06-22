package ar.steps;

import ar.validator.GetTimeEntryValidator;
import io.cucumber.java.en.Then;

public class GetTimeEntrySteps {


    GetTimeEntryValidator validator = new GetTimeEntryValidator();

    @Then("^se valida la descripcion '(.*)' en el get time entry$")
    public void seValidaElCambioDeNombreEnElProject(String descripcion) {
        validator.validateDescriptionEsperado(descripcion);
    }
}
