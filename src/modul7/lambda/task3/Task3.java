package modul7.lambda.task3;

import java.util.Random;
import java.util.function.Supplier;

public class Task3 {

  public static void main(String[] args) {
    Supplier<Integer> rnd = () -> new Random().nextInt(11);
    System.out.println(rnd.get());
    System.out.println(rnd.get());
    System.out.println(rnd.get());
    System.out.println(rnd.get());
  }
}
