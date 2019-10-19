package innerclasses;

import java.util.function.Predicate;

public class AnonymousInnerClassChallenger {

    public static void main(String... silentHill) {
        var newSlay = "---";
        var jamesShot = "---";

        Predicate<String> pyramidHeadAttack = new Predicate<String>() {
            @Override
            public boolean test(String pyramidHeadSlay) {
                return newSlay == new String(pyramidHeadSlay).intern();
            }
        }.and(new PyramidHead()).or(james -> james.equals(jamesShot)).negate();

        System.out.println(pyramidHeadAttack.test("---"));
    }

    static class PyramidHead implements Predicate<String> {
        @Override
        public boolean test(String axeAttack) {
            return axeAttack.equals("--!");
        }
    }

}



