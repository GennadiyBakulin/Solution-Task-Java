package modul7.lambda.task1;

import java.util.Scanner;
import java.util.function.Predicate;

public class Task1 {

  public static void main(String[] args) {
    String str = null;
    Predicate<String> isNotNul = string -> string != null;
    System.out.println(isNotNul.test(str));
  }

}
