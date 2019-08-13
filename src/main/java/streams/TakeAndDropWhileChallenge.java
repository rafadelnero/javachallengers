package streams;

import java.util.List;
import java.util.stream.Stream;

public class TakeAndDropWhileChallenge {

    public static void main(String... castleVania) {
        List<Integer> alucardHits = List.of(9, 7, 1, 8, 5);
        List<Integer> draculaHits = List.of(9, 6, 5, 7, 8);

        Stream<Integer> alucardPerformedHits = alucardHits.stream()
                .takeWhile(i -> i > 5)
                .dropWhile(i -> i > 8);

        Stream<Integer> draculaPerformedHits = draculaHits.stream()
                .takeWhile(i -> i > 1)
                .dropWhile(i -> i > 7);

        Stream.of(alucardPerformedHits, draculaPerformedHits).flatMap(h -> h)
               .forEach(System.out::print);
    }

}
