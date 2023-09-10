package academy.beyondeducation.java.part2.inheritance;

import academy.beyondeducation.java.part2.inheritance.interactor.Interactor;

public class Inheritance {
    public static void main(String[] args) {
        Interactor interactor = new Interactor();
//        interactor.formatInteraction()
        // the formatInteraction method is not visible due to protected scope
        String person = "Laura";
        WelcomeInteractor welcomeInteractor = new WelcomeInteractor();
        String welcome = welcomeInteractor.welcome(person);
        System.out.println("message = " + welcome);
        DepartureInteractor departureInteractor = new DepartureInteractor();
        String depart = departureInteractor.depart(person);
        System.out.println("message = " + depart);
    }
}
