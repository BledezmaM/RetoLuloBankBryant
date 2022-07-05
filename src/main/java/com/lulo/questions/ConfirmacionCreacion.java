package com.lulo.questions;

import com.lulo.utils.BodyResponses;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmacionCreacion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BodyResponses.getStatusCreacion().equals("200");
    }

    public static ConfirmacionCreacion usuarioPost() {
        return new ConfirmacionCreacion();
    }
}
