package certification.RetoChouca.tasks;

import certification.RetoChouca.userinterfaces.Home;
import certification.RetoChouca.userinterfaces.Personal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static certification.RetoChouca.userinterfaces.Complete.*;
import static certification.RetoChouca.userinterfaces.Devices.*;
import static certification.RetoChouca.userinterfaces.Personal.NEXT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class RegistroUserUtes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                Click.on(Home.register),
                SendKeys.of("Jeison").into(Personal.FIRST_NAME),
                SendKeys.of("Sanchez").into(Personal.LAST_NAME),
                SendKeys.of("amdres.sanchez9315@gmail.com").into(Personal.EMAIL),
                SendKeys.of("Diciembre").into(Personal.MONTH),
                SendKeys.of("15").into(Personal.DAY),
                SendKeys.of("1993").into(Personal.YEAR)

        );
        actor.attemptsTo(Click.on(NEXT.of("Next: Location")));
        actor.attemptsTo(WaitUntil.the(NEXT.of("Next: Devices"),isEnabled()));
        actor.attemptsTo(Click.on(NEXT.of("Next: Devices")),
                Click.on(YOUR_COMPUTER),
                Click.on(OPTION.of("Linux")),
                Click.on(VERSION),
                Click.on(OPTION.of("Manjaro")));
        actor.attemptsTo(Click.on(LANGUAGE),
                Click.on(OPTION.of("English")));
        actor.attemptsTo(Click.on(NEXT.of("Next: Last Step")));
        actor.attemptsTo(Enter.theValue("123456789+A-b").into(PASSWORD),
                Enter.theValue("123456789+A-b").into(CONFIRM_PASSWORD),
                Click.on(PRIVACY),
                Click.on(CONDITIONS));
        actor.attemptsTo(Click.on(COMPLETE));
        try {
            BrowseTheWeb.as(actor).getDriver().wait(8);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
   public static RegistroUserUtes makeinformation(){
        return instrumented(RegistroUserUtes.class);
    }
}
