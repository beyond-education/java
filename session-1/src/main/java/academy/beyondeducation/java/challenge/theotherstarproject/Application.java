package academy.beyondeducation.java.challenge.theotherstarproject;

public class Application {
    public static void main(String[] args) {
        Numbers input1 = new Numbers(5, 1);
        CountdownGenerator generator = new CountdownGenerator();
        CountdownAlgorithm algorithm1 = new DescendingCountdown();
        String sequence1 = generator.generate(input1, algorithm1);
        System.out.println("sequence1 = " + sequence1);
        Numbers input2 = new Numbers(1, 3);
        CountdownAlgorithm algorithm2 = new AscendingCountdown();
        String sequence2 = generator.generate(input2, algorithm2);
        System.out.println("sequence2 = " + sequence2);
    }
}
