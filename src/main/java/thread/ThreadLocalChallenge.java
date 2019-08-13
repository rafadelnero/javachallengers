package thread;

public class ThreadLocalChallenge {
    public static void main(String... doYourBest) throws InterruptedException {
        MarvelThreadLocal wolverine = new MarvelThreadLocal("Wolverine", true);
        startJoinThread(wolverine);
        System.out.println(wolverine.xmanName.get());

        startJoinThread(new MarvelThreadLocal("Xavier", true));
        startJoinThread(new MarvelThreadLocal("Cyclops", false));
    }

    private static void startJoinThread(MarvelThreadLocal marvelThreadLocal)
            throws InterruptedException {
        marvelThreadLocal.start();
        marvelThreadLocal.join();
    }

    static class MarvelThreadLocal extends Thread {
        ThreadLocal<String> xmanName = new ThreadLocal<>();
        boolean canBeatMagneto;

        MarvelThreadLocal(String name, boolean canBeatMagneto) {
            xmanName.set(name);
            this.canBeatMagneto = canBeatMagneto;
        }

        public void run() {
            if (canBeatMagneto)
                System.out.println(xmanName.get());
            else
                System.out.println("Magneto");
        }
    }
}
