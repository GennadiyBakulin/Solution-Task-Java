package modul6.callable.task2;

import java.util.Random;
import java.util.concurrent.Callable;

public class NumberGenerator implements Callable<String> {

  @Override
  public String call() throws Exception {
    int num = 0;

    for (int i = 0; i < 10; i++) {
      num += new Random().nextInt();
    }

    Thread.sleep(1500);

    System.out.print(Thread.currentThread().getName() + " : ");

    return String.valueOf(num);
  }
}
