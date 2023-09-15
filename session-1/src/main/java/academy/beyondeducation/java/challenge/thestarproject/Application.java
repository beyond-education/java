package academy.beyondeducation.java.challenge.thestarproject;

public class Application {
    public static void main(String[] args) {
        StarProjectComposer composer = new StarProjectComposer();
        StarInput input1 = new StarInput("Earth", "Hello universe!");
        StarAlgorithm algorithm1 = new OneStarAlgorithm();
        String transmission1 = composer.compose(input1, algorithm1);
        System.out.println("transmission1 = " + transmission1);
        StarInput input2 = new StarInput("Our Planet", "Hey you!");
        StarAlgorithm algorithm2 = new OneToThreeStarAlgorithm();
        String transmission2 = composer.compose(input2, algorithm2);
        System.out.println("transmission2 = " + transmission2);
    }
}
