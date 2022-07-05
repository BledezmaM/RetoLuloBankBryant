package com.lulo.tasks;

import com.lulo.utils.BodyResponses;
import com.lulo.utils.JsonBody;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.List;

import static com.lulo.utils.Constantes.APPLICATION_JSON;
import static com.lulo.utils.Constantes.URL_CREACION;

public class CrearUsuario implements Task {

    private final List<String> data;

    public CrearUsuario(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.reset();
        actor.attemptsTo(
                Post.to(URL_CREACION)
                        .with(requestSpecification -> requestSpecification
                                .header("accept", APPLICATION_JSON)
                                .contentType(APPLICATION_JSON)
                                .body(JsonBody.crearBody(data)))
        );
        BodyResponses.setStatusCreacion(String.valueOf(SerenityRest.lastResponse().statusCode()));
        BodyResponses.setBodyResponseCreacion(SerenityRest.lastResponse().body().asString());
    }

    public static CrearUsuario post(List<String> data) {
        return Tasks.instrumented(CrearUsuario.class, data);
    }
}
