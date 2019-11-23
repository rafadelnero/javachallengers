package map;

import java.util.HashMap;
import java.util.Map;

public class PutMapChallenge {

	public static void main(String... doYourBest) {
		Map<Map<Object, String>, String> mainMap = new HashMap<>();
		
		Map<Object, String> subMap1 = new HashMap<>();
		subMap1.put(new Integer(1), "A");
		Map<Object, String> subMap2 = new HashMap<>();
		subMap2.put(new Integer(1), "A");
		Map<Object, String> subMap3 = new HashMap<>();
		subMap3.put(new Integer(1), "A");

		System.out.println(subMap1.equals(subMap2));
		System.out.println(subMap3.equals(subMap2));

		mainMap.put(subMap1, "crazyMap1");
		mainMap.put(subMap2, "crazyMap2");
		mainMap.put(subMap3, "crazyMap3");

		System.out.println(mainMap.get(subMap3));
		System.out.println(mainMap.size());
	}

}

// Farhad - 6
