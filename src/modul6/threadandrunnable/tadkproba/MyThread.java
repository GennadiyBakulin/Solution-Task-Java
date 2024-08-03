package modul6.threadandrunnable.tadkproba;

public class MyThread implements Runnable {

  @Override
  public void run() {

    while (true) {
      synchronized (this) {
        notify();
        System.out.println(Thread.currentThread().getName());
        try {
          wait();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

      }

    }
  }
}
