package collectionfactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// A - no space for Marvel heros here!|Where are the villains?
// B - no space for villains, and exits
// C - Joker, Riddler, Joker
// D - Harley Quinn, Joker, Riddler, Joker

public class CollectionFactoriesChallenge {
    public static void main(String... doYourBest) {
        final Collection<Object> finalDcCharacters = new ArrayList<>();
        List<String> dcHeros = List.of();
        Set<String> dcVillains = Set.of();

        try {
            dcHeros.add("Deadpool");
        } catch (UnsupportedOperationException e) {
            System.out.print("no space for Marvel heros here!|");
        }

        try {
            dcVillains.stream().collect(Collectors.toList()).add("Harley Quinn");
            finalDcCharacters.addAll(new ArrayList<>(dcVillains));
        } catch (UnsupportedOperationException | IllegalArgumentException e) {
            System.out.print("no space for villains");
            System.exit(0);
        }

        try {
            var villains = Set.copyOf(dcVillains);
            finalDcCharacters.addAll(List.of(villains,
                    Set.of("Joker", "Riddler", "Joker")));
        } catch (IllegalArgumentException e) {
            System.out.print("Where are the villains?");
        }
        finalDcCharacters.forEach(System.out::println);
    }

}




