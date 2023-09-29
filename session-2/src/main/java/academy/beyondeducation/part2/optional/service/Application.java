package academy.beyondeducation.part2.optional.service;

import academy.beyondeducation.part2.optional.data.Bird;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Bird> birdsEachDay = new ArrayList<>();
        birdsEachDay.add(new Bird("Parrot", 6));
        birdsEachDay.add(new Bird("Eagle", 8));
        birdsEachDay.add(new Bird("Owl", 3));
        birdsEachDay.add(new Bird("Hummingbird", 1));
        birdsEachDay.add(new Bird("Gull", 4));
        SpottingBirdsManager spottingBirdsManager = new SpottingBirdsManager();
        ArrayList<Bird> longSpottedBirds = spottingBirdsManager.getLongSpottedBirds(birdsEachDay);
        System.out.println("longSpottedBirds = " + longSpottedBirds);
    }
}
