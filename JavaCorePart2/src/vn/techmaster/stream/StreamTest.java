package vn.techmaster.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void test() {
        List<Movie> movies = List.of(
                new Movie("Phuc", 10),
                new Movie("Quan", 20),
                new Movie("Giang", 15)
        );

        var filtered = movies.stream()
                        .filter(like -> like.getLikes() > 10)
                        .collect(Collectors.toList());

        System.out.println(filtered);
    }
}
