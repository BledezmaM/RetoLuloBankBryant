package com.lulo.stepdefinitions;

import com.lulo.exceptions.ResultNotWaited;
import com.lulo.questions.ConfirmacionCreacion;
import com.lulo.tasks.CrearUsuario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class CreacionUsuarioStepDefinition {
    @Cuando("^se crea el usuario$")
    public void seCreaElUsuario(DataTable dataTable) {
        List<String> data = dataTable.values();
        OnStage.theActorInTheSpotlight().attemptsTo(CrearUsuario.post(data));
    }

    @Entonces("valida la creacion del usuario")
    public void validaLaCreacionDelUsuario() {
        OnStage.theActorInTheSpotlight().should(seeThat(ConfirmacionCreacion.usuarioPost(), Matchers.equalTo(true)).orComplainWith(ResultNotWaited.class, ResultNotWaited.CREACION_USUARIO));
    }
}
