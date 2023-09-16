package academy.beyondeducation.solo.challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class VintageCollector {
    public Set<String> getUniqueThings(ArrayList<String> things) {
        Set<String> uniqueItems = new HashSet<>();
        for(String item : things) {
            uniqueItems.add(item);
        }
        return uniqueItems;
    }
}
