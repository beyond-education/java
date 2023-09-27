package academy.beyondeducation.part1.examples;

public class ClassroomApplication {
    public static void main(String[] args) {
        int grade = 5;
        SchoolGrader schoolGrader = new SchoolGrader();
        boolean hasPassed = schoolGrader.hasPassed2(grade, n -> n < 5);
        System.out.println("hasPassed = " + hasPassed);
    }
}
