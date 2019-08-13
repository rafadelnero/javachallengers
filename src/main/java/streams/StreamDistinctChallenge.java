package streams;

import java.util.Set;

public class StreamDistinctChallenge {

    public static void main(String... doYourBest) {
        Set<Warrior> warriors = Set.of(new Warrior("Ezio"), new Warrior("Ezio"),
                new Warrior("Kratos"), new Warrior("Cloud"), new Warrior("Alucard"));

        warriors.stream()
                .distinct()
                .forEach(w -> System.out.println(w.name));
    }

    static class Warrior {
        private String name;

        Warrior(String name) {
            this.name = name;
        }

        public int hashCode() {
            return this.name.length();
        }

        public boolean equals(Object obj) {
            return this.name.equals(((Warrior) obj).name);
        }
    }
}




