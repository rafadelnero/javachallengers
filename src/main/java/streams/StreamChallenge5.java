package streams;

import java.util.List;

public class StreamChallenge5 {
    public static void main(String... doYourBest) {
        List<Jedi> jediList = List.of(new Jedi("Luke", 20),
                new Jedi("ObiWan", 30), new Jedi("QuiGon", 40));

        jediList.stream()
                .filter(jedi -> jedi.name.startsWith("Obi") || jedi.name.startsWith("Luke"))
                .filter(jedi -> jedi.name.startsWith("QuiGon"))
                .map(Jedi::getAge)
                .filter(age -> age > 10)
                .forEach(System.out::println);
    }

    static class Jedi {
        private String name;
        private int age;

        Jedi(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String getName() { return name; }
        int getAge() {
            return age; }
    }
}


