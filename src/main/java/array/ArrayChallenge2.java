package array;

import java.util.Arrays;

public class ArrayChallenge2 {
	public static void main(String... doYourBest) {
		int[] anyArray = new int[5];
		anyArray[0] = 0;
		anyArray[1] = 2;
		anyArray[2] = 4;
		anyArray[3] = 6;
		anyArray[4] = 8;

		int[] otherArray = anyArray;

        doSum(anyArray);
        doSum(otherArray);
        Arrays.stream(anyArray).forEach(System.out::println);
    }
	private static void doSum(int[] anyArray) {
        for (int i = 0; i < anyArray.length; i++) {
            anyArray[i] = anyArray[i] + 2;
        }
    }
}

// Farhad Rodrigo Rinaldo - 4 6 8 10 12


