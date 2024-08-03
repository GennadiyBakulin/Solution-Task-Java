package modul1;

import java.util.Random;

public class Task18 {

  public static void main(String[] args) {

    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Random().nextInt();
    }

    int index = 0;
    int max = arr[index];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        index = i;
      }
    }
    System.out.println(index);
  }
}
