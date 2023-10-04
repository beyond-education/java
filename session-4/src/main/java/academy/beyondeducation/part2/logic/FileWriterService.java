package academy.beyondeducation.part2.logic;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWriterService {
    public void writeToFile(String path, List<String> content) {
        try {
            Files.write(Paths.get(path), content);
        } catch (Exception e) {
            System.out.println("Error message = " + e);
        }
    }
}
