package com.lulo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.lulo.features/eliminacion_usuario.feature"
        , glue = "com.lulo.stepdefinitions"
        , snippets = CucumberOptions.SnippetType.CAMELCASE
        , tags = "@EliminacionUsuario"
)
public class EliminarUsuarioRunner {
}
