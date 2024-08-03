package modul6.threadandrunnable.task1;

import java.util.Random;

public class MyRunnable implements Runnable {

  int[] array = new int[10];

  @Override
  public void run() {
    Random rnd = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = rnd.nextInt(1000);
    }

    int max = array[0];

    for (int i = 1; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }

    System.out.println(Thread.currentThread().getName() + " : " + max);

  }
}
