package academy.beyondeducation.part1.examples.grades;

public class Application {
    public static void main(String[] args) {
        GradeChecker gradeChecker = grade -> grade < 5;
        int studentGrade = 4;
        if (gradeChecker.check(studentGrade)) {
            System.out.println("The student passes with a " + studentGrade);
        } else {
            System.out.println("The student doesn't pass with a " + studentGrade);
        }
    }
}
