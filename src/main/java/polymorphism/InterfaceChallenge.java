package polymorphism;

public class InterfaceChallenge {
	
	public static void main(String[] args) {
		new Homer().action();
	}
	
	static class Homer implements Prankster, Crazy {
		@Override
		public void action() {
			System.out.println("Test");
		}
	}
	
	interface Prankster extends Crazy {
		void action();
	}
	
	interface Crazy {
		void action();
	}
}
