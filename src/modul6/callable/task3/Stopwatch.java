package modul6.callable.task3;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalTime;
import java.util.concurrent.Callable;

public class Stopwatch implements Callable<String> {

  @Override
  public String call() {

    File file = new File("text.txt");
    String text = "Hello World! " + LocalTime.now();

    System.out.println(Thread.currentThread().getName() + " : " + text);

    writeToFile(file, text);

    return "";
  }

  public synchronized void writeToFile(File file, String text) {
    try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file, true))) {

      bos.write((text + "\n").getBytes(StandardCharsets.UTF_8));
      bos.flush();

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
