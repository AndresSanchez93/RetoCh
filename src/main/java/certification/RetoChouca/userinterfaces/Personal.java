package certification.RetoChouca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Personal {
    public static final Target FIRST_NAME=Target.the("First Name").located(By.id("firstName"));
    public static final Target LAST_NAME=Target.the("Last Name").located(By.cssSelector("input[name='lastName']"));
    public static final Target EMAIL=Target.the("Email").locatedBy("#email");

    public static final Target MONTH=Target.the("Month").located(By.xpath("//select[@id='birthMonth']"));
    public static final Target DAY=Target.the("Day").locatedBy("//select[@id='birthDay']");
    public static final Target YEAR=Target.the("Year").located(By.cssSelector("select[name='birthYear']"));
    public static final Target NEXT=Target.the("Next").locatedBy("//*[text()='{0}']");
}
