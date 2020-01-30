package streams;

import java.util.stream.IntStream;

public class LimitStreamChallenger {

    public static void main(String... doYourBest) {
        IntStream.iterate(0, i -> i + 1) // Infinite stream
                .limit(5) // limiting the stream to 5
                .filter(i -> i % 2 == 0) // the number 0 to 4 will be filtered to even numbers
                .forEach(System.out::print); // 0 2 4

        IntStream.iterate(0, i -> i + 1) // Infinite stream
                .peek(System.out::print) // 01234
                .filter(i -> i % 2 == 0) // Even numbers will filtered first
                .limit(3)
                .forEach(System.out::print); // 024 - trigger to make the stream work
    }

}
