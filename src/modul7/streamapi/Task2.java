package modul7.streamapi;

import java.util.Arrays;

public class Task2 {

  public static void main(String[] args) {
    int[] inches = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    Arrays.stream(inches).filter(x -> x % 2 == 0).forEach(System.out::println);
    System.out.println(Arrays.stream(inches).mapToDouble(x -> x * 2.54).sum());
    System.out.println(
        Arrays.stream(inches).mapToDouble(x -> x * 2.54).reduce(Double::sum).getAsDouble());
  }
}
