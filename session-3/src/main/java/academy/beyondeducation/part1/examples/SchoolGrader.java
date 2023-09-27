package academy.beyondeducation.part1.examples;

import java.util.function.Predicate;

public class SchoolGrader {
    boolean hasPassed(int grade, GradeChecker gradeChecker){
        return gradeChecker.check(grade);
    }

    boolean hasPassed2(int grade, Predicate<Integer> gradeChecker){
        return gradeChecker.test(grade);
    }
}
