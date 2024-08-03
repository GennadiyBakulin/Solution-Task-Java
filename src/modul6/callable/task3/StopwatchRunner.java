package modul6.callable.task3;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StopwatchRunner {

  public static void main(String[] args)
      throws ExecutionException, InterruptedException, IOException {

    ExecutorService pool = Executors.newFixedThreadPool(3);

    for (int i = 0; i < 10; i++) {
      Callable<String> stopwatch = new Stopwatch();
      pool.submit(stopwatch);

      Thread.sleep(1000);
    }

    pool.shutdown();
  }
}
