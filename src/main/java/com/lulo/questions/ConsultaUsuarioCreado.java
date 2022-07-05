package com.lulo.questions;

import com.lulo.utils.BodyResponses;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultaUsuarioCreado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BodyResponses.getStatusConsulta().equals("200");
    }

    public static ConsultaUsuarioCreado servicioGet() {
        return new ConsultaUsuarioCreado();
    }
}
