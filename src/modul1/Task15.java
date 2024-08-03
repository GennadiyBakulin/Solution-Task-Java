package modul1;

public class Task15 {

  public static void main(String[] args) {
    int count = 0;
    for (int i = 50; i <= 70; i++) {
      for (int j = 2; j <= i; j++) {
        if (i % j == 0 && i != j) {
          break;
        }
        if (i == j) {
          count++;
        }
      }
      if (count == 2) {
        System.out.println(i);
        break;
      }
    }
  }
}
