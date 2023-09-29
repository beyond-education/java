package academy.beyondeducation.part2.service;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ReadService readService = new ReadService();
        String content = readService.readFile("D:\\EigeneDateien\\Beyond\\Allianz\\Java Examples\\java\\session-4\\session-4\\testFile.txt");
        System.out.println("content = " + content);
        List<String> lines = List.of("1 Banana", "100g Flour", "100ml Milk", "Some sugar");
        WriteService writeService = new WriteService();
        writeService.writeToFile("newFile.txt", lines);
    }
}
