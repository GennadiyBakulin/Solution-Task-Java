package Modul1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task21 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int dimension = scanner.nextInt();

    int[] arr = new int[dimension];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Random().nextInt(20);
    }

    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(deleteLocalMaximums(arr)));

  }

  static int[] deleteLocalMaximums(int[] arr) {
    int[] arrayCope = Arrays.copyOf(arr, arr.length);
    boolean[] booleans = new boolean[arrayCope.length];

    for (int i = 0; i < arrayCope.length; i++) {
      if ((i == 0 && arrayCope[i] > arrayCope[i + 1]) || (i == arrayCope.length - 1
          && arrayCope[i] > arrayCope[i - 1])) {
        booleans[i] = true;
      } else if (arrayCope[i] > arrayCope[i + 1] && arrayCope[i] > arrayCope[i - 1]) {
        booleans[i] = true;
      }
    }

    int dimensionOutputArray = arrayCope.length;

    for (boolean a : booleans) {
      if (a) {
        dimensionOutputArray--;
      }
    }

    int[] outputArray = new int[dimensionOutputArray];
    int k = 0;

    for (int i = 0; i < arrayCope.length; i++) {
      if (!booleans[i]) {
        outputArray[k] = arrayCope[i];
        k++;
      }
    }

    return outputArray;
  }
}
