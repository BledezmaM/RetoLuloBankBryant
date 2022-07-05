package com.lulo.stepdefinitions;


import com.lulo.exceptions.ResultNotWaited;
import com.lulo.questions.ConsultaUsuarioCreado;
import com.lulo.tasks.ConsultaUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ConsultaUsuarioStepDefinition {
    @Cuando("^consulta el usuario$")
    public void consultaElUsuario(String userName) {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultaUsuario.get(userName));
    }

    @Entonces("valida la consulta del usuario")
    public void validaLaConsultaDelUsuario() {
        OnStage.theActorInTheSpotlight().should(seeThat(ConsultaUsuarioCreado.servicioGet(), Matchers.equalTo(true)).orComplainWith(ResultNotWaited.class, ResultNotWaited.CONSULTA_USUARIO));
    }
}
