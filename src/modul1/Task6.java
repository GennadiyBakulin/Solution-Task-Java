package modul1;

import java.util.Scanner;

public class Task6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println(getThirdDigit(number));
  }

  static int getThirdDigit(int number) {
    return number / 100 % 10;
  }

}
