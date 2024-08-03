package modul6.threadandrunnable.task6;

import java.util.Random;

public class Producer implements Runnable {

  private final Store store;

  public Producer(Store store) {
    this.store = store;
  }

  @Override
  public void run() {
    while (store.isActive()) {
      store.put(new Random().nextInt(1, 101));
    }
  }
}
