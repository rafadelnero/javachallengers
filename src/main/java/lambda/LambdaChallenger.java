package lambda;

import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class LambdaChallenger {

    static int value;

    public static void main(String... doYourBest) {
        IntSupplier valueS = () -> value++;
        Consumer<Object> oneMoreValue = (Object test) -> value++;

        oneMoreValue.accept(2);
        System.out.println(value + " " + valueS.getAsInt());
    }

}
