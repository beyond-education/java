package academy.beyondeducation.part2_different;

import java.io.FileWriter;

public class FileWriterService {
    public void writeToFile(String content, String fileName) {
        try (FileWriter myWriter = new FileWriter(fileName, true)) {
            myWriter.write(content);
        } catch (Exception e) {

        }
    }
}
