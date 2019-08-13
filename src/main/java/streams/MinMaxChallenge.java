package streams;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinMaxChallenge {

    public static void main(String... doYourBest) {
        IntStream intStream = List.of(1, 2, 3, 4, 5, 6)
                .stream().mapToInt(n -> n);

        IntStream intStream2 = intStream;

        OptionalInt optIntMin = intStream.min();
        OptionalInt optIntMax = intStream2.max();

        int sum = optIntMax.orElse(5) + optIntMin.orElse(5);

        System.out.println(sum);
    }

}


