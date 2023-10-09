package academy.beyondeducation.part2.challenge;

import academy.beyondeducation.part2.challenge.logic.IngredientsFilter;
import academy.beyondeducation.part2.challenge.logic.IngredientsReader;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        IngredientsReader ingredientsReader = new IngredientsReader();
        IngredientsFilter ingredientsFilter = new IngredientsFilter();
        String path = "/home/guillermo/development/workspace/beyond/java/files/ingredients.txt";
        List<String> original = ingredientsReader.readIngredients(path);
        System.out.println("original = " + original);
        List<String> exclusions = List.of("garlic");
        List<String> ingredients = ingredientsFilter.filterIngredients(original, exclusions);
        System.out.println("ingredients = " + ingredients);
    }
}
