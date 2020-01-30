package innerclasses;

public class AbstractChallenger {
    static final int FORCE = 10;

    public static void main(String... doYourBest) {
        DarthVader darthVader = (number) -> number;

        Rey masterYoda = new AbstractChallenger().new Rey() {
            public int getNumber(int number) {
                return number;
            }
        };

        System.out.println(darthVader.getNumber(FORCE) +
                masterYoda.getNumber(Integer.valueOf(FORCE)));

        System.out.println("The stronger Jedi is: " + (darthVader.getNumber(FORCE) >
                masterYoda.getNumber(FORCE) ? "Darth Vader" : "Master Yoda"));
    }

    abstract class Rey implements LukeSkywalker {
        int getNumber(Integer force) {
            return force + 10;
        }
    }

    interface DarthVader {
        int getNumber(int force);
    }

    interface LukeSkywalker extends DarthVader {
        int getNumber(int force);
    }

}
