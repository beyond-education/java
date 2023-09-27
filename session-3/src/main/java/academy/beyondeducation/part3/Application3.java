package academy.beyondeducation.part3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        List<Food> foods = List.of(new Food("Potato salad"));
        List<Food> sortedFoods = foods.stream()
                .sorted(Comparator.comparing(Food::getName))
                .collect(Collectors.toList());
    }
}
