package modul6.threadandrunnable.task6;

public class Consumer implements Runnable {

  private final Store store;

  public Consumer(Store store) {
    this.store = store;
  }

  @Override
  public void run() {
    while (store.isActive()) {
      store.get();
    }
  }
}
