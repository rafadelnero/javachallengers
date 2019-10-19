package instanceofobj;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class InstanceofChallenge<T> {

	T t;
	
	public static void main(String... doYourBest) {
		if (null instanceof Object)
			System.out.println("null is instance of Object");
		if (null instanceof AtomicInteger)
			System.out.println("null is instance of AtomicInteger");
		if (null instanceof StackOverflowError)
			System.out.println("null is instance of StackOverflowError");

		if (new ArrayList<>() instanceof Cloneable)
			if (new String() instanceof CharSequence)
				if (new InstanceofChallenge().t instanceof Object)
					System.out.println("Exception?");
	}
	
}

// Rodrigo - empty
