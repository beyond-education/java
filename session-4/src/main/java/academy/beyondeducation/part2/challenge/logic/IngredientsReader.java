package academy.beyondeducation.part2.challenge.logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IngredientsReader {
    public List<String> readIngredients(String path) {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.err.println(e);
            return new ArrayList<>();
        }
    }
}
