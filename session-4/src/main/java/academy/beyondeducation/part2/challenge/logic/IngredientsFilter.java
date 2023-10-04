package academy.beyondeducation.part2.challenge.logic;

import java.util.ArrayList;
import java.util.List;

public class IngredientsFilter {
    public List<String> filterIngredients(List<String> original, List<String> exclusions) {
        List<String> ingredients = new ArrayList<>(original);
        for (String exclusion : exclusions) {
            ingredients.remove(exclusion);
        }
        return ingredients;
    }
}
