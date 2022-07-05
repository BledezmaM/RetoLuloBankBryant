package com.lulo.tasks;

import com.lulo.utils.BodyResponses;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static com.lulo.utils.Constantes.APPLICATION_JSON;
import static com.lulo.utils.Constantes.URL_CONSULTA;

public class EliminarUsuario implements Task {

    private final String userName;

    public EliminarUsuario(String userName) {
        this.userName = userName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.reset();
        actor.attemptsTo(
                Get.resource(URL_CONSULTA + userName)
                        .with(requestSpecification -> requestSpecification
                                .header("accept", APPLICATION_JSON))
        );

        BodyResponses.setStatusEliminacion(String.valueOf(SerenityRest.lastResponse().statusCode()));
        BodyResponses.setBodyResponseEliminacion(SerenityRest.lastResponse().body().asString());

        System.out.println(BodyResponses.getStatusEliminacion());
        System.out.println(BodyResponses.getBodyResponseEliminacion());
    }

    public static EliminarUsuario delete(String userName) {
        return Tasks.instrumented(EliminarUsuario.class, userName);
    }
}
