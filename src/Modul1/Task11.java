package Modul1;

import java.util.Scanner;

public class Task11 {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int amount = scanner.nextInt();
    currencyAmount(amount);
  }

  static void currencyAmount(int amount) {
    if (amount % 10 == 0 || amount % 10 >= 5 || amount >= 11 && amount <= 14) {
      System.out.println(amount + " рублей");
    } else if (amount % 10 == 1) {
      System.out.println(amount + " рубль");
    } else {
      System.out.println(amount + " рубля");
    }
  }
}
