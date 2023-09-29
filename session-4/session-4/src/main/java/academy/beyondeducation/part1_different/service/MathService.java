package academy.beyondeducation.part1_different.service;

import java.util.stream.IntStream;

public class MathService {
    public int getFaculty(int number) {
        return IntStream.rangeClosed(2, number)
                .reduce(1, (n1,n2)->n1*n2);
    }
}
