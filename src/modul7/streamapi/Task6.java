package modul7.streamapi;

import java.util.stream.IntStream;

public class Task6 {

  public static void main(String[] args) {
    int n = 100;
    System.out.println(getFirst(n));

    System.out.println(IntStream.iterate(2, i -> 2 * i <= n, i -> i + 2)
        .filter(i -> i > 10)
        .findFirst()
        .orElseGet(null));

  }

  public static Integer getFirst(int n) {
    for (int i = 2; 2 * i <= n; i += 2) {
      if (i > 10) {
        return i;
      }
    }
    return null;
  }
}
