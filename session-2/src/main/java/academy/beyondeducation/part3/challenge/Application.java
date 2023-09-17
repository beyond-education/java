package academy.beyondeducation.part3.challenge;

import java.util.ArrayList;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Chair");
        items.add("Table");
        items.add("Vase");
        items.add("Painting");
        items.add("Chair");
        items.add("Vase");

        VintageCollector vintageCollector = new VintageCollector();
        Set<String> uniqueItems = vintageCollector.getUniqueThings(items);
        System.out.println("uniqueItems = " + uniqueItems);
    }
}
