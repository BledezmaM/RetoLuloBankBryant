package com.lulo.questions;

import com.lulo.utils.BodyResponses;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmacionEliminacion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BodyResponses.getStatusEliminacion().equals("200");
    }

    public static ConfirmacionEliminacion usuarioDelete() {
        return new ConfirmacionEliminacion();
    }
}
