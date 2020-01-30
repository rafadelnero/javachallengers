package generics;

@SuppressWarnings(value = "all")
public class GenericsChallenge2 {

    public static void main(String... doYourBest) {
        Archer archer = new Archer();

        archer.attack("->");
        archer.attack(1.0);
        archer.attack(Float.valueOf(1));
    }

     static class Archer<T> {
        T t;

        void attack(T t) {
            System.out.println(this.t);
        }
    }

}



