package modul1;

import java.util.Scanner;

public class Task9 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите размеры прямоугольного отверстия a и b: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Введите радиус картонки r: ");
    int r = sc.nextInt();
    System.out.println(isCloseHole(a, b, r));
  }

  static boolean isCloseHole(int a, int b, int r) {
    double d = Math.hypot(a, b);
    return d <= 2 * r;
  }

}
