package academy.beyondeducation.part2.challenge;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VintageCollector {
    public Set<String> getUniqueThings(List<String> things) {
        Set<String> uniqueItems = new HashSet<>();
        for(String item : things) {
            uniqueItems.add(item);
        }
        return uniqueItems;
    }
}
