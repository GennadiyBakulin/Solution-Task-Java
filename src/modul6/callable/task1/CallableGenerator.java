package modul6.callable.task1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class CallableGenerator implements Callable<Set<String>> {

  @Override
  public Set<String> call() throws Exception {

    Set<String> set = new HashSet<>();

    for (int i = 0; i < 10; i++) {
      String fileName = Thread.currentThread().getName() + "_" + i + ".txt";
      set.add(fileName);

      try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName))) {
        bos.write(fileName.getBytes(StandardCharsets.UTF_8));
        bos.flush();
      }
    }

    System.out.println(Thread.currentThread().getName());

    Thread.sleep(1000);

    return set;
  }
}
