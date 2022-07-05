package com.lulo.stepdefinitions;


import com.lulo.exceptions.ResultNotWaited;
import com.lulo.questions.ConfirmacionActualizacion;
import com.lulo.tasks.ActualizacionUsuario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ActualizacionUsuarioStepDefinition {
    @Cuando("^actualiza el usuario$")
    public void actualizaElUsuario(DataTable dataTable) {
        List<String> data = dataTable.values();
        OnStage.theActorInTheSpotlight().attemptsTo(ActualizacionUsuario.put(data));
    }

    @Entonces("valida la actualizacion del usuario")
    public void validaLaActualizacionDelUsuario() {
        OnStage.theActorInTheSpotlight().should(seeThat(ConfirmacionActualizacion.usuarioPut(), Matchers.equalTo(true)).orComplainWith(ResultNotWaited.class, ResultNotWaited.ACTUALIZACION_USUARIO));
    }
}
