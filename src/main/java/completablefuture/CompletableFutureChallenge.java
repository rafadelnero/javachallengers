package completablefuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CompletableFutureChallenge {
  static ExecutorService executor = Executors.newCachedThreadPool();

  public static void main(String... oracleCodeOneAdventure) {
    CompletableFuture<List<String>> adventureStart = new CompletableFuture<>();

    Supplier<List<String>> sanFranSightSupplier = () ->
        List.of("Alcatraz", "Cable Car", "Golden Gate", "Lombard Street");

    adventureStart.completeAsync(sanFranSightSupplier, executor)
        .thenCompose(sights -> CompletableFuture.supplyAsync(() -> sights.stream()
                .map(String::length)
                .collect(Collectors.toList())))
        .thenAccept(ratings -> {
            var rating = ratings.stream()
                    .dropWhile(sightRating -> sightRating <= 12)
                    .findFirst()
                    .orElse(0);
            System.out.print("Rating: " + rating + " ");
        });

    System.out.print("time to go home :( ");
  } // Farhad Dorival - Rating: 14 time to go home :(
    // Rodrigo - Rating: 8 time to go home :(
}




// A - Rating: 0 time to go home :(
// B - time to go home :( Rating: 12
// C - time to go home :( Rating: 14
// D - Rating: 14 time to go home :(



