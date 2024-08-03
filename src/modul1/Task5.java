package modul1;

import java.util.Scanner;

public class Task5 {

  static int amount(int abcd) {
    return abcd % 100 + abcd / 100;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println(amount(number));
  }
}
