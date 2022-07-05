package com.lulo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static com.lulo.utils.Constantes.URL;

public class Hook {

    @Before
    public void InicializarActor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("actor");
    }

    @Cuando("^consulta servicio de creacion usaurio")
    public void consultaServicioDeCreacionUsaurio() {
        OnStage.theActorInTheSpotlight().whoCan(CallAnApi.at(URL));
    }
}
