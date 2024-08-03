package modul6.threadandrunnable.task3;

import java.util.List;
import java.util.Random;

public class Generator extends Thread {

  private final List<Integer> list;

  public Generator(List<Integer> list) {
    this.list = list;
  }

  public List<Integer> getList() {
    return list;
  }

  @Override
  public void run() {

    while (true) {
      synchronized (list) {
        if (getList().size() < 100) {
          list.add(new Random().nextInt(300));
        } else {
          break;
        }
      }
      try {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

    }
  }
}
