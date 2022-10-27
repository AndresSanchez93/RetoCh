package certification.RetoChouca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {

    public static Target YOUR_COMPUTER=Target.the("Your Computer").locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[1]");
    public static Target VERSION=Target.the("Version").locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[2]");
    public static Target LANGUAGE=Target.the("Language").locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[3]");
    public static final Target OPTION=Target.the("Option").locatedBy("//*[text()='{0}']");

}
