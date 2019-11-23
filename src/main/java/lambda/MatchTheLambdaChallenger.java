package lambda;

import java.util.function.*;

public class MatchTheLambdaChallenger {

    public static void main(String... doYourBest) {
        Supplier<String> moeBeerSupplier = () -> "DarthVader";
        Supplier<String> methodReferenceMoeBeerSupplier = String::new;

        Predicate<String> beerQualityTest = (jedi) -> jedi.equals("jedi");
        Predicate<String> methodReferenceBeerQualityTest = String::isEmpty;

        Consumer<String> beerConsumer = (saber) -> System.out.println("Moe uses the " + saber);
        Consumer<Integer> methodReferenceConsumer = System.out::println;

        Function<String, String> beerProcessor = (jedi) -> jedi.concat(jedi);
        Function<String, String> methodReferenceBeerProcessor = String::toString;

        BiFunction<String, String, Object> biBeerProcessor = (x,y) -> { return x + y; };
        BiFunction<String, String, Object> methodReferenceBiBeerProcessor = String::compareTo;

        UnaryOperator<String> pureUniBeerProcessor = (homer) -> homer.concat("Marge");
        UnaryOperator<Integer> methodReferenceUniPureBeerProcessor = Integer::valueOf;

        BinaryOperator<Double> pureBiBeerProcessor = (x,y) -> { return x + y;};
        BinaryOperator<Double> methodReferenceBiPureBeerProcessor = Double::max;
    }

}


/*

        Supplier<String> moeBeerSupplier = () -> "beerFromMoe"; // Line 6
        Supplier<String> methodReferenceMoeBeerSupplier = String::new; // Line 7

        Predicate<String> beerQualityTest = (beerQuality) -> beerQuality.equals("good"); // Line 9
        Predicate<String> methodReferenceBeerQualityTest = "good"::equals; // Line 10

        Consumer<String> beerConsumer = (beerBrand) -> System.out.println("Homer consumes the beer:" + beerBrand); // Line 12
        Consumer<Integer> methodReferenceConsumer = System.out::println; // Line 13

        Function<String, String> beerProcessor = (beerBrand) -> "Barney drinks the beer:" + beerBrand; // Line 15
        Function<String, String> methodReferenceBeerProcessor = "Homer drinks the beer: "::concat; // Line 16

        BiFunction<String, String, Object> biBeerProcessor = (String beer1, String beer2) -> beer1 + beer2; // Line 18
        BiFunction<String, String, Object> methodReferenceBiBeerProcessor = String::compareTo; // Line 19

        UnaryOperator<String> pureUniBeerProcessor = pureBeer -> pureBeer.concat("super"); // Line 21
        UnaryOperator<Integer> methodReferenceUniPureBeerProcessor = Integer::valueOf; // Line 22

        BinaryOperator<String> pureBiBeerProcessor = (beer1, beer2) -> beer1 + beer2; // Line 24
        BinaryOperator<String> methodReferenceBiPureBeerProcessor = String::concat; // Line 25

 */
