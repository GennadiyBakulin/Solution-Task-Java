package modul7.streamapi;

import java.util.List;
import java.util.stream.IntStream;

public class Task3 {

  public static void main(String[] args) {
    int minValue = 1;
    int maxValue = 100;
    List<Integer> list = IntStream.range(minValue, maxValue).boxed().toList();
//    System.out.println(list.stream().filter(x -> x % 3 == 0 && x % 5 == 0).findAny().isPresent());
    System.out.println(list.stream().anyMatch(x -> x % 3 == 0 && x % 5 == 0));
  }
}
