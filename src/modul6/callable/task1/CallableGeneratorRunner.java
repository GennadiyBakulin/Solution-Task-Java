package modul6.callable.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableGeneratorRunner {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    ExecutorService pool = Executors.newFixedThreadPool(3);
    Set<Future<Set<String>>> futures = new HashSet<>();

    for (int i = 0; i < 10; i++) {
      Callable<Set<String>> callableGenerator = new CallableGenerator();
      Future<Set<String>> future = pool.submit(callableGenerator);
      futures.add(future);
    }

    Set<String> set = new HashSet<>();

    for (Future<Set<String>> future : futures) {
      set.addAll(future.get());
    }

    System.out.println(set);

    pool.shutdown();
  }
}
