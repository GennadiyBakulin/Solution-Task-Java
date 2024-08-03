package modul1;

public class Task14 {

  public static void main(String[] args) {
    long number = 7893823445L;
    int summa = 0;
    do {
      summa += (int) (number % 10);
      number /= 10;
    } while (number != 0);

    System.out.println(summa);
  }
}
