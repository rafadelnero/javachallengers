package equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodeChallenge {

    public static void main(String... doYourBest) {
        System.out.println(new Simpson("Bart").equals(new Simpson("Bart")));
        Simpson overriddenHomer = new Simpson("Homer") {
            public int hashCode() {
                return (43 + 777) + 1;
            }
        };

        System.out.println(new Simpson("Homer").equals(overriddenHomer));

        var set = new HashSet<>(Set.of(new Simpson("Homer"), new Simpson("Marge")));
        set.add(new Simpson("Homer"));
        set.add(overriddenHomer);

        System.out.println(set.size());
    }

    static class Simpson {
        String name;

        Simpson(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            Simpson otherSimpson = (Simpson) obj;
            return this.name.equals(otherSimpson.name) &&
                    this.hashCode() == otherSimpson.hashCode();
        }

        @Override
        public int hashCode() {
            return (43 + 777);
        }
    }
}
