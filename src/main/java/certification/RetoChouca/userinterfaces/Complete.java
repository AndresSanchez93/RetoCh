package certification.RetoChouca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Complete {
    public static Target PASSWORD=Target.the("Password").locatedBy("#password");
    public static Target CONFIRM_PASSWORD=Target.the("Confirm Password").locatedBy("#confirmPassword");
    public static Target PRIVACY=Target.the("Privacy").locatedBy("#privacySetting");
    public static Target CONDITIONS=Target.the("Conditions").located(By.cssSelector("#termOfUse"));

    public static Target COMPLETE=Target.the("complete").located(By.cssSelector("#laddaBtn"));
}
