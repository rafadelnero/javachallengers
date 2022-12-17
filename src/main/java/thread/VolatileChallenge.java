package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VolatileChallenge {

  private static final Logger LOGGER = Logger.getLogger("Test");

  private static int MY_INT = 0;

  public static void main(String[] args) {
    new ChangeListener().start();
    new ChangeMaker().start();
  }

  static class ChangeListener extends Thread {

    @Override
    public void run() {
      int local_value = MY_INT;

      System.out.println(MY_INT);
      int i =0;
      while (local_value < 5) {

        System.out.println("I:" + i++ + " V - " + local_value + ":" + MY_INT);
        if (local_value != MY_INT) {
          LOGGER.log(Level.INFO, "Got Change for MY_INT : {0}", MY_INT);
          local_value = MY_INT;
        }
      }

    }
  }

  static class ChangeMaker extends Thread {

    @Override
    public void run() {

      int local_value = MY_INT;
      while (MY_INT < 5) {

        LOGGER.log(Level.INFO, "Incrementing MY_INT to {0}", local_value + 1);
        MY_INT = ++local_value;

        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
