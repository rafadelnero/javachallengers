package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JediStreamChallenger {

    public static void main(String... doYourBest) {
        List<String> jediList = List.of("Yoda", "Luke", "Anakin", "Obi Wan", "Luke");

        jediList.stream()
                .skip(1)
                .filter(jedi -> jedi.startsWith("Lu"))
                .limit(4)
                .distinct()
                .map(String::length)
                .flatMap(jedi -> Stream.of(jedi))
                .peek(System.out::println);
    }
}
