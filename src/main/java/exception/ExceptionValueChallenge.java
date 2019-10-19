package exception;


public class ExceptionValueChallenge {

		static int kratos, zeus, hades;

		public static void main(String... doYourBest) {
			try {
				invokeAGod(kratos = 1, lightningOfZeus(zeus = 2), hades = 3);
			} catch (Exception e) {
				System.out.println(kratos + " " + zeus + " " + hades);
			}
		}

		static int lightningOfZeus(int i) throws Exception {
			throw new StackOverflowError("Wowww!"); // Exception RuntimeException Error
		}

		static int invokeAGod(int a, int b, int c) {
			return a + b + c;
		}

}

// Rodrigo -




