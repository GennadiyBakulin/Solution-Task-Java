package modul6.threadandrunnable.task6;

import java.util.ArrayDeque;
import java.util.Queue;

public class Store {

  private final Queue<Integer> queue = new ArrayDeque<>(200);

  private volatile int processedItem = 1;
  private volatile boolean isActive = true;

  public synchronized boolean isActive() {
    return isActive;
  }

  public synchronized void put(Integer number) {
    while (queue.size() >= 100 && isActive) {
      try {
        wait();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }

    queue.add(number);
    notifyAll();
  }

  public synchronized void get() {
    while (queue.isEmpty()) {
      try {
        wait();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }

    if (processedItem <= 10000) {
      System.out.println(queue.poll() + " : " + processedItem);
      processedItem++;
    } else {
      isActive = false;
    }

    if (queue.size() <= 80) {
      notifyAll();
    }
  }
}
