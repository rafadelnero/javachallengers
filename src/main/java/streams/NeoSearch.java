package streams;

import java.util.List;
import java.util.function.Predicate;

public class NeoSearch {

    public static void main(String... doYourBest) {
        List<String> ls = List.of("Neo", "Neo", "Morpheus", "Neo", "Neo");

        Predicate<String> neoSearch = str -> {
            System.out.println("Agent Smith is looking for Neo...");
            return str.contains("Neo");
        };

        var binaryNumbers = List.of(1, 0, 1, 1).stream();
        Integer binarySum = binaryNumbers.reduce(Integer::sum).orElseThrow(StackOverflowError::new);

        boolean neoFound = ls.stream().filter(str -> str.length() >= binarySum).allMatch(neoSearch);
        System.out.println(neoFound);
    }

}

// Farhad - Agent Smith is looking for Neo...
//          Agent Smith is looking for Neo...
