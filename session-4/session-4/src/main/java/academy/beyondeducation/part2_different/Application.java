package academy.beyondeducation.part2_different;

public class Application {
    public static void main(String[] args) {
        FileReaderService fileReaderService = new FileReaderService();
        String fileContent = fileReaderService.getFileContent("D:\\EigeneDateien\\Beyond\\Allianz\\Java Examples\\java\\session-4\\session-4\\testFile.txt");
        FileContentService fileContentService = new FileContentService();
        String modified = fileContentService.everyETo3(fileContent);
        FileWriterService fileWriterService = new FileWriterService();
        fileWriterService.writeToFile(modified, "newFile.txt");
    }
}
