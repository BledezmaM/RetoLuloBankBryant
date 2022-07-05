package com.lulo.questions;

import com.lulo.utils.BodyResponses;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmacionActualizacion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BodyResponses.getStatusActualizacion().equals("200");
    }

    public static ConfirmacionActualizacion usuarioPut() {
        return new ConfirmacionActualizacion();
    }
}
