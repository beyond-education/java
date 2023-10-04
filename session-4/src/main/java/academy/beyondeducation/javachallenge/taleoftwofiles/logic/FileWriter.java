package academy.beyondeducation.javachallenge.taleoftwofiles.logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWriter {
    public void write(String path, List<String> lines) {
        try {
            Files.write(Paths.get(path), lines);
        } catch (IOException e) {
            System.err.println("File with path could not be written: " + path);
            System.err.println(e);
        }
    }
}
