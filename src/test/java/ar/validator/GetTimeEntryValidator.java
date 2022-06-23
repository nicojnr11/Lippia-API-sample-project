package ar.validator;

import api.model.TimeEntry.GetTimeEntryResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class GetTimeEntryValidator {

    public void validateDescriptionEsperado(String description){
        GetTimeEntryResponse[] response = (GetTimeEntryResponse[]) APIManager.getLastResponse().getResponse();
        boolean flagDescription = false;
        for (GetTimeEntryResponse descrip:response){
            if (descrip.getDescription().contains(description)) flagDescription = true;
        }
        Assert.assertTrue(flagDescription,"La descripcion "+description+" no se encuentra en la lista");
    }
}
