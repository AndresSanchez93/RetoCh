package co.com.utest.certification.retochouca.stepdefinitions;

import certification.RetoChouca.Questions.ElTitulo;
import certification.RetoChouca.tasks.RegistroUserUtes;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class RegistroUsuarioStepdefinitions {
    @Managed(driver="chrome")
    WebDriver driver;
    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jeison");
    }

    @Dado("^que el Usuario quiere ingresar en la pagina de inicio Utest$")
    public void queElUsuarioQuiereIngresarEnLaPaginaDeInicioUtest() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com/"));
    }

    @Cuando("^el usuario crea una cuenta llenando todos los campos$")
    public void elUsuarioCreaUnaCuentaLlenandoTodosLosCampos() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroUserUtes.makeinformation());
    }


    @Entonces("^el usuario ve la pagina con el titulo (.*)$")
    public void elUsuarioVeLaPaginaConElTituloUTestWelcomeToUTest(String titulo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElTitulo.deLaPagina(), Matchers.is(Matchers.equalTo(titulo))));
    }
}
