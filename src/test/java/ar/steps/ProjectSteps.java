package ar.steps;

import ar.validator.ProjectValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;



public class ProjectSteps extends PageSteps {

    ProjectValidator validator = new ProjectValidator();
    @Then("se valida la cantidad de projects")
    public void seValidaLaCantidadDeProjects() {
        validator.validate();
    }

    @Then("el project con el nombre '(.*)' se encuentra en la lista")
    public void elProjectConElNombreSeEncuentraEnLaLista(String nombre) {
        validator.validateNombreEsperado(nombre);
    }

    @Then("^se valida el cambio de nombre '(.*)' en el project$")
    public void seValidaElCambioDeNombreEnElProject(String nombre) {
        validator.validateCambioNombre(nombre);
    }


}
