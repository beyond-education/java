package academy.beyondeducation.javachallenge.taleoftwofiles.logic;

import java.util.ArrayList;
import java.util.List;

public class LinesMerger {
    public List<String> merge(List<String> lines1, List<String> lines2) {
        List<String> merged = new ArrayList<>();
        merged.addAll(lines1);
        merged.addAll(lines2);
        return merged;
    }
}
