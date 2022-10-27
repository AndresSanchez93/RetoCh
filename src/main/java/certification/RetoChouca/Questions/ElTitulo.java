package certification.RetoChouca.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ElTitulo implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        return BrowseTheWeb.as(actor).getDriver().getTitle();
    }
    public static ElTitulo deLaPagina(){
        return  new ElTitulo();
    }
}
