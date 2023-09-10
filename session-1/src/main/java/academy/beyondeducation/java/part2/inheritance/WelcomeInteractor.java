package academy.beyondeducation.java.part2.inheritance;

import academy.beyondeducation.java.part2.inheritance.interactor.Interactor;

public class WelcomeInteractor extends Interactor {
    public String welcome(String person) {
        return formatInteraction("Welcome", person);
    }
}
