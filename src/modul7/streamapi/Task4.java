package modul7.streamapi;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task4 {

  public static void main(String[] args) {
    IntStream.generate(() -> new Random().nextInt(1, 11))
        .limit(100)
        .boxed().filter(x -> x % 2 == 0)
        .map(String::valueOf)
        .collect(Collectors.toSet())
        .forEach(System.out::println);
  }
}
