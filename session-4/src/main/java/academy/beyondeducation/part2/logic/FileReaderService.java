package academy.beyondeducation.part2.logic;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {
    public List<String> getFileContent(String path) {
        List<String> content = new ArrayList<>();
        try{
            content = Files.readAllLines(Paths.get(path));
        } catch (Exception e) {
            System.out.println("Error Message = " + e);
        }
        return content;
    }
}
