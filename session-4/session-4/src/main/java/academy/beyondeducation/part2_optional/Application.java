package academy.beyondeducation.part2_optional;

import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        String lineToBeAdded = "Thats my secret pancake recipe";
        String filePath = "newTest2.txt";
        try {
            Files.write(Path.of(filePath), List.of(lineToBeAdded), StandardOpenOption.APPEND);
            Files.write(Path.of(filePath), List.of(lineToBeAdded), StandardOpenOption.APPEND);
            Files.write(Path.of(filePath), List.of(lineToBeAdded), StandardOpenOption.APPEND);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
