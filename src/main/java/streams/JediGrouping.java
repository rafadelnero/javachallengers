package streams;

import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class JediGrouping {

    public static void main(String... doYourBest) {
        List<Jedi> jediList = List.of(new Jedi("Luke", 53), new Jedi("Anakin", 10),
                new Jedi("ObiWan", 59), new Jedi("Yoda", 900));

        Map<Integer, List<Jedi>> jediByLength = jediList.stream()
                .filter(j -> j.age < 100)
                .collect(Collectors.groupingBy(j -> j.name.length()));

        List<Jedi> newJediList = Optional.ofNullable(jediByLength.get(4))
                .orElse(List.of(new Jedi("QuiGon", 20)));

        newJediList.forEach(jedi -> System.out.println(jedi.name));
    }

    @AllArgsConstructor
    static class Jedi {
        private String name;
        private int age;
    }

}
