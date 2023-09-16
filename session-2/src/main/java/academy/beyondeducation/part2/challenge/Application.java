package academy.beyondeducation.part2.challenge;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> birdsEachDay = new ArrayList<>();
        birdsEachDay.add(2);
        birdsEachDay.add(5);
        birdsEachDay.add(7);
        birdsEachDay.add(3);
        birdsEachDay.add(1);
        SpottingBirdsCounter spottingBirdsCounter = new SpottingBirdsCounter();
        int sum = spottingBirdsCounter.sumSpottedBirds(birdsEachDay);
        System.out.println("sum = " + sum);
    }
}
