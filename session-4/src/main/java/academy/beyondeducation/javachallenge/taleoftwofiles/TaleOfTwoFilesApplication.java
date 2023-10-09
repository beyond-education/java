package academy.beyondeducation.javachallenge.taleoftwofiles;

import academy.beyondeducation.javachallenge.taleoftwofiles.logic.FileReader;
import academy.beyondeducation.javachallenge.taleoftwofiles.logic.FileWriter;
import academy.beyondeducation.javachallenge.taleoftwofiles.logic.LinesMerger;

import java.util.List;

public class TaleOfTwoFilesApplication {
    public static void main(String[] args) {
        String hw = "/home/guillermo/development/workspace/beyond/java/files/HW.txt";
        String po = "/home/guillermo/development/workspace/beyond/java/files/PO.txt";
        String byteville = "/home/guillermo/development/workspace/beyond/java/files/Byteville.txt";

        FileReader fileReader = new FileReader();
        LinesMerger linesMerger = new LinesMerger();
        FileWriter fileWriter = new FileWriter();

        List<String> linesHW = fileReader.read(hw);
        List<String> linesPO = fileReader.read(po);
        List<String> linesByteville = linesMerger.merge(linesHW, linesPO);
        fileWriter.write(byteville, linesByteville);
    }
}
