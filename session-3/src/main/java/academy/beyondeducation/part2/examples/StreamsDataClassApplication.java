package academy.beyondeducation.part2.examples;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDataClassApplication {
    public static void main(String[] args) {
        List<Movie> movies = List.of(new Movie("Inception", 4), new Movie("Green Lantern", 1),
                new Movie("The Matrix", 5), new Movie("Indiana Jones", 2));
        System.out.println(movies);
        List<String> bestMovieNames = movies.stream()
                .filter(movie -> movie.rating() > 3)
                .map(movie -> movie.title())
                .collect(Collectors.toList());
        System.out.println(bestMovieNames);
    }
}
