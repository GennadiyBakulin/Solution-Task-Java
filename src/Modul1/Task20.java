package Modul1;

import java.util.Arrays;

public class Task20 {

  public static void main(String[] args) {

    int[] arr = new int[]{1,1,87,24,24,102,57,41,24,1};

    int[] output = Arrays.stream(arr).distinct().toArray();

    System.out.println(Arrays.toString(output));

  }
}
