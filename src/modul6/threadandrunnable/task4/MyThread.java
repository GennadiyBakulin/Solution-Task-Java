package modul6.threadandrunnable.task4;

public class MyThread implements Runnable {

  @Override
  public void run() {
    try {
      printerNameThread();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  private void printerNameThread() throws InterruptedException {
    System.out.println("Имя потока: " + Thread.currentThread().getName());
    Thread.sleep(2000);
  }
}
