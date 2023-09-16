package academy.beyondeducation.part2.optional.service;

import academy.beyondeducation.part2.optional.data.Bird;

import java.util.ArrayList;

public class SpottingBirdsManager {
    private final int MIN_DURATION = 5;

    public ArrayList<Bird> getLongSpottedBirds(ArrayList<Bird> birds) {
        ArrayList<Bird> longSpottedBirds = new ArrayList<>();
        for(Bird bird : birds) {
            if(bird.duration() > MIN_DURATION) {
                longSpottedBirds.add(bird);
            }
        }
        return longSpottedBirds;
    }
}
