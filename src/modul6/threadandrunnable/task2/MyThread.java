package modul6.threadandrunnable.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class MyThread implements Runnable {

  @Override
  public void run() {
    File file = new File(Thread.currentThread().getName() + ".txt");

    try (
        FileWriter writer = new FileWriter(file, StandardCharsets.UTF_8)) {
      for (int i = 0; i < 10; i++) {
        writer.write(new Random().nextInt() + "\n");
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
