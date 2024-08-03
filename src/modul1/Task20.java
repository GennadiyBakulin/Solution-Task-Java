package modul1;

import java.util.Arrays;

public class Task20 {

  public static void main(String[] args) {

    int[] array = new int[]{1, 1, 87, 24, 24, 102, 57, 41, 24, 1111, 2, 2};

    int[] tempArray = new int[array.length];

    int n = 0;

    tempArray[n] = array[0];

    for (int i = 1; i < array.length; i++) {
      boolean duplicate = false;

      for (int j = 0; j <= n; j++) {
        if (array[i] == tempArray[j]) {
          duplicate = true;
          break;
        }
      }

      if (!duplicate) {
        n++;
        tempArray[n] = array[i];
      }

    }

    int[] outputArray = new int[n + 1];

    System.arraycopy(tempArray, 0, outputArray, 0, n + 1);

    System.out.println(Arrays.toString(outputArray));

  }

}
