package string;

public class StringChallenge {
	
	public static void main(String... doYourBest) {
		var jedi = "masterYoda";
		
		changeString(jedi);
		
		System.out.println(jedi);
	}
	
	static String changeString(String jedi) {
		jedi.replace(jedi, "darthVader");
		
		return jedi;
	}
	
}




