package thread;

public class DangerousThread {

    public static void main(String... doYourBest) throws InterruptedException {
        Thread heisenberg = new Heisenberg();

        heisenberg.start();
        heisenberg.join();

        heisenberg.start();
        heisenberg.join();
    }

    static class Heisenberg extends Thread {

        public void run() {
            System.out.println("I am the danger!");
        }

    }
}
