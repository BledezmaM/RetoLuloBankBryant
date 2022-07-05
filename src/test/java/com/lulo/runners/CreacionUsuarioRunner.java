package com.lulo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.lulo.features/creacion_usuario.feature"
        , glue = "com.lulo.stepdefinitions"
        , snippets = CucumberOptions.SnippetType.CAMELCASE
        , tags = "@CreacionUsuario"
)
public class CreacionUsuarioRunner {
}
