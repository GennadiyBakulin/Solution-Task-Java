package modul1;

import java.util.Scanner;

public class Task8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println(isLastDigitSeven(number));
  }

  static boolean isLastDigitSeven(int number) {
    return number % 10 == 7;
  }
}
