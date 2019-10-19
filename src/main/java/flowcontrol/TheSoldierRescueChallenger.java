package flowcontrol;

/**
 * - Difference between keyword and reserved word
 * - A variable can be declared with a reserved word
 * - Change with break to yield
 * - Type erasure Generics
 */
public class TheSoldierRescueChallenger {

    public static void main(String... doYourBest) {
        StringBuilder yield = new StringBuilder();
        yield.append(rescueSokolov("BigBoss"));
        yield.append(rescueMeryl("SolidSnake"));
        yield.append(rescueMeryl("LiquidSnakeX"));
        System.out.println(yield);
    }
    static Object rescueSokolov(String eliteSoldier){
        return switch (eliteSoldier){
            case "BigBoss": yield "S";
            case "Ocelot": yield  "O";
            default : yield  "D";
        };
    }
    // Rodrigo Dorival - SSLD
    static <T extends String>  T rescueMeryl(T eliteSoldier) {
        return switch ((String) eliteSoldier){
            case "SolidSnake" -> (T) "S";
            case "LiquidSnake" ->  {
                yield (T) "L";
            }
            //case "MetalGear" -> (T) "?";
            default -> (T) "D";
        };
    }

}
