package modul1;

public class Task13 {

  public static void main(String[] args) {
    int fact = 1;
    int i = 2;
    while (i <= 10) {
      fact *= i++;
    }
    System.out.println(fact);
  }
}
