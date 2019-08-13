package function;

import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FunctionChallenge {

    public static void main(String ... doYourBest) {
        String starWars = "Luke DarthVader ObiWan QuiGonJinn Palpatine";

        Function<String, Stream<String>> lineSplitter =
                l -> Pattern.compile(" ").splitAsStream(l);

        Stream.of(starWars)
                .flatMap(lineSplitter)
                .sorted(((o1, o2) -> o2.compareTo(o1)))
                .forEachOrdered(System.out::println);
    }

}


