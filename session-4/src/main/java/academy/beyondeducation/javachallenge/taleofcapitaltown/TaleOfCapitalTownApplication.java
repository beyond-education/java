package academy.beyondeducation.javachallenge.taleofcapitaltown;

import academy.beyondeducation.javachallenge.taleoftwofiles.logic.FileReader;
import academy.beyondeducation.javachallenge.taleoftwofiles.logic.FileWriter;
import academy.beyondeducation.javachallenge.taleoftwofiles.logic.LinesMerger;

import java.util.List;
import java.util.stream.Collectors;

public class TaleOfCapitalTownApplication {
    public static void main(String[] args) {
        String mixedScript = "/home/guillermo/development/workspace/beyond/java/files/MixedScript.txt";
        String upperScript = "/home/guillermo/development/workspace/beyond/java/files/UpperScript.txt";

        FileReader fileReader = new FileReader();
        FileWriter fileWriter = new FileWriter();

        List<String> lines = fileReader.read(mixedScript);
        List<String> upperLines = lines.stream()
                .map(line -> line.toUpperCase())
                .collect(Collectors.toList());
        fileWriter.write(upperScript, upperLines);
    }
}
