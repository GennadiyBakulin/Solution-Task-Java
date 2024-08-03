package modul6.threadandrunnable.task3;

import java.util.ArrayList;
import java.util.List;

public class GeneratorRunner {

  public static void main(String[] args) throws InterruptedException {
    List<Integer> list = new ArrayList<>(100);
    new Generator(list).start();
    new Generator(list).start();
    new Generator(list).start();
    new Generator(list).start();
    new Generator(list).start();
    new Generator(list).start();
    new Generator(list).start();
    new Generator(list).start();
    new Generator(list).start();
    new Generator(list).start();

    Thread.sleep(5000);
    System.out.println("size: " + list.size());
    System.out.println(list);
  }
}
