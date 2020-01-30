package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDeclarationChallenge {
	
	public static void main(String... doYourBest) throws IOException {
		new Scientist() {
			public void talk() throws IOException {
				super.talk();
			}
		}.talk();
	}

		// Farhad  - The anonymous inner class method will not throw FileNotFoundException - Making experiences
	  // Dorival  - It will occur a compilation error at line 17
	static class Scientist {
		void talk() throws IOException {
			System.out.println("Making experiences");
		}
	}
	
	static class Sheldon extends Scientist {
		public void talk() throws IOException {
			System.out.println("My spot");
		}
	}
	
}
