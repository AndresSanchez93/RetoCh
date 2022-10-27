package co.com.utest.certification.retochouca.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\registro_usuario.feature",
glue = "co.com.utest.certification.retochouca.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class RegistroUsuario {
}
