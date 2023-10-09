package academy.beyondeducation.part2;

import academy.beyondeducation.part2.logic.FileReaderService;
import academy.beyondeducation.part2.logic.FileWriterService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class FilesApplication {
    public static void main(String[] args) {
//        try {
//            String pathToWrite = "/home/guillermo/development/workspace/beyond/java/files/test.txt";
//            List<String> strings = Files.readAllLines(Paths.get(pathToWrite));
//            System.out.println("strings = " + strings);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        String path = "/home/guillermo/development/workspace/beyond/java/files/test.txt";
        FileReaderService fileReaderService = new FileReaderService();
        List<String> fileContent = fileReaderService.getFileContent(path);
        System.out.println("fileContent = " + fileContent.stream().collect(Collectors.joining("\n")));

        FileWriterService fileWriterService = new FileWriterService();
        String pathToWrite = "/home/guillermo/development/workspace/beyond/java/files/test2.txt";
        fileWriterService.writeToFile(pathToWrite , List.of("This classroom", "is working", "super hard"));
        try {
            Files.write(Paths.get(pathToWrite), List.of("Append", "Beyond", "Salvador"), StandardOpenOption.APPEND);
        } catch (Exception e) {

        }
    }
}
