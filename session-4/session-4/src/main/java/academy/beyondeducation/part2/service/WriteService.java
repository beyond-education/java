package academy.beyondeducation.part2.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriteService {
    public void writeToFile(String path, List<String> lines) {
        try {
            Files.write(Path.of(path), lines);
        } catch (Exception e) {
            System.out.println("Could not write to file at " + path);
        }
    }
}
