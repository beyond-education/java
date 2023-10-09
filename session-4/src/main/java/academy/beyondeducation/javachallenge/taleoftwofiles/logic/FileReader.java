package academy.beyondeducation.javachallenge.taleoftwofiles.logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public List<String> read(String path) {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.err.println("File with path could not be read: " + path);
            System.err.println(e);
            return new ArrayList<>();
        }
    }
}
