package academy.beyondeducation.part2.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ReadService {
    public String readFile(String path) {
        try {
            List<String> content = Files.readAllLines(Path.of(path));
            return content.stream().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            System.out.println("There was a problem when reading the file at " + path);
        }
        return "";
    }
}
