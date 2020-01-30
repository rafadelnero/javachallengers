package collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueCollectionChallenge {
    public static int CAPACITY = 4;

    public static void main(String... doYourBest) {
        Queue<String> breakingBadQueue = new ArrayBlockingQueue<>(CAPACITY);

        breakingBadQueue.add("Heisenberg");
        breakingBadQueue.add("Jesse");
        breakingBadQueue.offer("Gus");
        breakingBadQueue.offer("Walter White Junior");
        breakingBadQueue.offer("Saul Goodman");

        String character = breakingBadQueue.peek();
        String anotherCharacter = breakingBadQueue.poll();

        ArrayBlockingQueue<String> arrayBlockingList = (ArrayBlockingQueue<String>) breakingBadQueue;
        arrayBlockingList.offer(character);
        arrayBlockingList.offer(anotherCharacter);

        System.out.println(breakingBadQueue);
    }
}
