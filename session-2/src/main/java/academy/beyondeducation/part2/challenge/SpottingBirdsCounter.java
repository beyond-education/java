package academy.beyondeducation.part2.challenge;

import java.util.ArrayList;

public class SpottingBirdsCounter {
    public int sumSpottedBirds(ArrayList<Integer> birdsEachDay) {
        int sum = 0;
        for (Integer birdsADay : birdsEachDay) {
            sum += birdsADay;
        }
        return sum;
    }
}
