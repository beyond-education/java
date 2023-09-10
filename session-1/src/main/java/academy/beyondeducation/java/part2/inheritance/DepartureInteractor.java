package academy.beyondeducation.java.part2.inheritance;

import academy.beyondeducation.java.part2.inheritance.interactor.Interactor;

public class DepartureInteractor extends Interactor {
    public String depart(String person) {
        return formatInteraction("Goodbye", person);
    }
}
