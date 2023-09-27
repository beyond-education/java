package academy.beyondeducation.part2.examples;

import java.util.List;
import java.util.stream.Collectors;

public class MovieApplication {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("Star Wars", 5), new Movie("Titanic", 5),
                new Movie("Run", 4), new Movie("Indiana Jones", 3)
        );
        System.out.println("movies = " + movies);

        List<String> bestMovies = movies.stream()
                .filter(movie -> movie.rating() > 3)
                .map(movie -> movie.title())
                .map(title -> title.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("bestMovies = " + bestMovies);
    }
}
