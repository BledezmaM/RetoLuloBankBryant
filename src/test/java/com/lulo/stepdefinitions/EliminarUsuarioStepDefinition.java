package com.lulo.stepdefinitions;


import com.lulo.exceptions.ResultNotWaited;
import com.lulo.questions.ConfirmacionEliminacion;
import com.lulo.tasks.EliminarUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class EliminarUsuarioStepDefinition {
    @Cuando("^elimina el usuario$")
    public void eliminaElUsuario(String userName) {
        OnStage.theActorInTheSpotlight().attemptsTo(EliminarUsuario.delete(userName));
    }

    @Entonces("valida la eliminacion del usuario")
    public void validaLaEliminacionDelUsuario() {
        OnStage.theActorInTheSpotlight().should(seeThat(ConfirmacionEliminacion.usuarioDelete(), Matchers.equalTo(true)).orComplainWith(ResultNotWaited.class, ResultNotWaited.ELIMINACION_USUARIO));
    }
}
