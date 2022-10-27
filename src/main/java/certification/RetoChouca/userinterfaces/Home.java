package certification.RetoChouca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target register=Target.the("register").
            locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
}
