package generics;

public class GetThePokemonChallenger {

	static <Ditto> Ditto cast(Object anyPokemon) { // ERROR1
		return (Ditto) anyPokemon;
	}

	public static void main(String... doYourBest) {
		Object charmander = 10;
		int pikachu = 10;
		Integer wartortle = 10;

		Integer mewtwo = (Integer) 89898989;

		Integer pokeball1 = cast(charmander);
		Integer pokeball2 = cast(pikachu); 
		Integer pokeball3 = cast(wartortle); 
		String pokeball4 = cast(mewtwo);
		System.out.printf("p1 = %d, p2 = %d, p3 = %d, p4 = %s",
				pokeball1, pokeball2, pokeball3, pokeball4);
	}
}

// Dorival - p1 = 10, p2 = 10, p3 = 10, p4 = 89898989
