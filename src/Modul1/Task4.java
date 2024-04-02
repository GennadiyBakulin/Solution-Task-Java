package Modul1;

import java.util.Scanner;

public class Task4 {

  static int getLastDigit(int number) {
    return number % 10;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println(getLastDigit(number));
  }

}
