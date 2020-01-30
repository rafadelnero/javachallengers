package datastructure;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import org.junit.Assert;
import org.junit.Test;

public class StackChallengerTest {

    StackChallenger<SimpsonCharacter> stackChallenger = new StackChallenger();

    @Test
    public void whenPushItemThenCheckIfContainsItem() {
        SimpsonCharacter simpson = new SimpsonCharacter("Homer", 35);

        stackChallenger.push(simpson);

        Assert.assertTrue(stackChallenger.contains(new SimpsonCharacter("Homer", 35)));
    }

    @Test
    public void whenPopItemsThenCheckIfItemsWereRemoved() {
        SimpsonCharacter krusty = new SimpsonCharacter("Krusty", 52);
        // LIFO Last in first out - insert elements on the top - remove elements from the top
        SimpsonCharacter burns = new SimpsonCharacter("Burns", 135);

        stackChallenger.push(krusty); // 3
        stackChallenger.push(new SimpsonCharacter("Homer", 39)); // 2
        stackChallenger.push(burns); // 1

        stackChallenger.pop(); // Removes the element that is on the top of the stack
        stackChallenger.pop();

        Assert.assertTrue(stackChallenger.contains(krusty));
    }

    @Test
    public void whenPushItemsThenCheckIfItemsAreAccessible() {
        SimpsonCharacter barney = new SimpsonCharacter("Barney", 40);

        stackChallenger.push(new SimpsonCharacter("Moe", 55));
        stackChallenger.push(barney);

        Assert.assertNotNull(stackChallenger.access(barney));
        Assert.assertNotNull(stackChallenger.access(new SimpsonCharacter("Moe", 55)));
    }
    @Test
    public void whenManipulatingItemsThenCheckTheSizeOfStack() {
        stackChallenger.push(new SimpsonCharacter("Moe", 55));
        stackChallenger.push(new SimpsonCharacter("Moe", 55));
        stackChallenger.pop();

        Assert.assertEquals(1, stackChallenger.size());
    }

    @Test
    public void whenAccessingItemsThenItemShouldBeReturned() {
        SimpsonCharacter lenny = new SimpsonCharacter("Lenny", 36);
        stackChallenger.push(lenny);

        SimpsonCharacter returnedItem = stackChallenger.access(lenny);

        Assert.assertEquals(lenny, returnedItem);
    }

    @AllArgsConstructor
    @EqualsAndHashCode
    static class SimpsonCharacter {
        String name;
        int age;
    }
}
