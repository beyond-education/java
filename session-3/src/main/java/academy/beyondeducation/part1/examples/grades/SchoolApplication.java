package academy.beyondeducation.part1.examples.grades;

import java.util.ArrayList;
import java.util.List;

public class SchoolApplication {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(1);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(5);
        SchoolGradesService schoolGradesService = new SchoolGradesService();
        int passed = schoolGradesService.calculateNumberOfStudentsWhoPassed(grades, grade -> grade < 5);
        System.out.println("passed = " + passed);
        passed = schoolGradesService.calculateNumberOfStudentsWhoPassedWithPredicate(grades, grade -> grade < 5);
        System.out.println("passed = " + passed);
    }
}
