package modul1;

import java.util.Scanner;

public class Task7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    System.out.println(getLengthLine(x1, y1, x2, y2));
  }

  static double getLengthLine(int x1, int y1, int x2, int y2) {
    return Math.hypot(x2 - x1, y2 - y1);
  }

}
