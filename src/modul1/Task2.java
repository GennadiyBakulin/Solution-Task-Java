package modul1;

public class Task2 {

  public static void main(String[] args) {

    System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));

  }

  public static long sum(int a, int b) {

    return (long) a + (long) b + (long) a * (long) b;
  }

}
