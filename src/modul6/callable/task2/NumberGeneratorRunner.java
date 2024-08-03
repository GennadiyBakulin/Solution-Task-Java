package modul6.callable.task2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NumberGeneratorRunner {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    ExecutorService pool = Executors.newFixedThreadPool(3);

    for (int i = 0; i < 10; i++) {
      Callable<String> numberGenerator = new NumberGenerator();
      Future<String> future = pool.submit(numberGenerator);

      System.out.println(future.get());
    }

    pool.shutdown();
  }
}
