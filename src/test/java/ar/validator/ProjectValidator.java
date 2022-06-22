package ar.validator;

import api.model.GetTimeEntryResponse;
import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;


public class ProjectValidator {
    public void validate(){
        ProjectResponse[] response = (ProjectResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response,"Response es null");
        for (ProjectResponse project:response) {
            Assert.assertNotNull(project.getClientId(),"getClientId es null");
        }
    }

    public void validateNombreEsperado(String nombre){
        ProjectResponse[] response = (ProjectResponse[]) APIManager.getLastResponse().getResponse();
        boolean flagNombre = false;
        for (ProjectResponse project:response) {
            if (project.getName().equals(nombre)) flagNombre = true;
        }
        Assert.assertTrue(flagNombre,"El project: "+nombre+" no se encuentra en la lista");
    }

    public void validateCambioNombre(String nombre){
        ProjectResponse response = (ProjectResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(nombre,response.getName(),"El nombre no fue editado");
    }
}
