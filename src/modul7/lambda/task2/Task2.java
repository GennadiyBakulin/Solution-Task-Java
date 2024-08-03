package modul7.lambda.task2;

import java.util.function.Function;

public class Task2 {

  public static void main(String[] args) {
    Function<Integer, String> number = num -> {
      if (num < 0) {
        return "Отрицательное число";
      } else if (num > 0) {
        return "Положительное число";

      } else {
        return "Ноль";
      }
    };
    Function<String, Integer> before = str -> -1;
    System.out.println(number.compose(before).apply("10"));
    System.out.println(number.apply(10));
    System.out.println(number.apply(-10));
    System.out.println(number.apply(0));
  }
}
