package bynarysearch;

import java.util.Arrays;

public class BinarySearchChallenge {

    static String[] marvel = {"Spiderman", "Venom", "Carnage", "Mysterio"};

    public static void main(String[] args) {
        Arrays.sort(marvel);

        System.out.println(Arrays.binarySearch(marvel, "Xavier"));
        System.out.println(marvel[Arrays.binarySearch(marvel, "Carnage")]);
        System.out.println(Arrays.binarySearch(marvel, "Lizard"));
        System.out.println(Arrays.binarySearch(marvel, "Apocalypse"));
        System.out.println(Arrays.binarySearch(marvel, "Spiderman"));
    }

}

// Rinaldo Farhad -1 Carnage -1 -1 2

