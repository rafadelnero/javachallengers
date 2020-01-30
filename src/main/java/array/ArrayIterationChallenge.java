package array;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArrayIterationChallenge {
	public static void main(String... doYourBest) {
		List<String> list = new CopyOnWriteArrayList<>();
 
		list.add("var1");
		list.add("var2");
		list.add("var3");
		list.add("var4");
		list.add("var5");

//		list.removeIf(e -> e.equals("var1") || e.equals("var4"));
//
		for (String var : list) {
			if (var.equals("var1") || var.equals("var4")) {
				list.remove(var);
			}
		}

		System.out.println(list);
	}
} // Alain - It's gonna throw an java.util.ConcurrentModificationException
