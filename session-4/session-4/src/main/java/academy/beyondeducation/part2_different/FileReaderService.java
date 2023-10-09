package academy.beyondeducation.part2_different;

import java.io.File;
import java.util.Scanner;

public class FileReaderService {
    public String getFileContent(String path) {
        File file = new File(path);
        try(Scanner myReader = new Scanner(file)) {
            //Scanner myReader = new Scanner(file);
            String fileContent = "";
            while (myReader.hasNext()) {
                fileContent += myReader.nextLine();
            }
            //myReader.close();
            return fileContent;
        } catch (Exception e) {

        }
        return "";


    }
}
