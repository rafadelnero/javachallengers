package streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class GroupingByCharacters {
    @Data
    @AllArgsConstructor // Lombok
    static class Character {
        String name;
        String sureName;
        Integer beerQuantity;
    }
    public static void main(String... doYourBest) {
        List<Character> characterList = List.of(new Character("Homer", "Simpson", 10),
                new Character("Bart", "Simpson", 1), new Character("Ned", "Flanders", 0),
                new Character("Tod", "Flanders", -1));

        Map<String, List<String>> familyMap = characterList.stream()
                .collect(groupingBy(Character::getSureName,
                        mapping(Character::getName, Collectors.toList())));

        Map<String, Integer> beerQuantityMap = characterList.stream()
                .collect(groupingBy(Character::getSureName,
                        summingInt(Character::getBeerQuantity)));

        System.out.println(familyMap);
        System.out.println(beerQuantityMap);
    }

}
