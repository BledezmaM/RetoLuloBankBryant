package com.lulo.tasks;

import com.lulo.utils.BodyResponses;
import com.lulo.utils.JsonBody;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.util.List;

import static com.lulo.utils.Constantes.APPLICATION_JSON;
import static com.lulo.utils.Constantes.URL_CONSULTA;

public class ActualizacionUsuario implements Task {

    private final List<String> data;

    public ActualizacionUsuario(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.reset();
        actor.attemptsTo(
                Put.to(URL_CONSULTA + data.get(1))
                        .with(requestSpecification -> requestSpecification
                                .header("accept", APPLICATION_JSON)
                                .contentType(APPLICATION_JSON)
                                .body(JsonBody.crearBody(data)))
        );
        BodyResponses.setStatusActualizacion(String.valueOf(SerenityRest.lastResponse().statusCode()));
        BodyResponses.setBodyResponseActualizacion(SerenityRest.lastResponse().body().asString());
    }

    public static ActualizacionUsuario put(List<String> data) {
        return Tasks.instrumented(ActualizacionUsuario.class, data);
    }
}
