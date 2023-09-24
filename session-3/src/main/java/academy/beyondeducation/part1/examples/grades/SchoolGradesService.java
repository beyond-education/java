package academy.beyondeducation.part1.examples.grades;

import java.util.List;
import java.util.function.Predicate;

public class SchoolGradesService {
    public int calculateNumberOfStudentsWhoPassed(List<Integer> grades, GradeChecker gradeChecker) {
        int numberOfStudentsWhoPassed = 0;
        for (Integer grade : grades) {
            if (gradeChecker.check(grade)) {
                numberOfStudentsWhoPassed++;
            }
        }
        return numberOfStudentsWhoPassed;
    }

    public int calculateNumberOfStudentsWhoPassedWithPredicate(List<Integer> grades, Predicate<Integer> gradeChecker) {
        int numberOfStudentsWhoPassed = 0;
        for (Integer grade : grades) {
            if (gradeChecker.test(grade)) {
                numberOfStudentsWhoPassed++;
            }
        }
        return numberOfStudentsWhoPassed;
    }
}
