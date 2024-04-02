package Modul1;

public class Task19 {

  public static void main(String[] args) {
    int[][] arr = new int[9][9];

    int dimension = arr.length;

    for (int i = 0; i < dimension; i++) {
      for (int j = 0; j < dimension; j++) {
        if (((j < i || j > dimension - i - 1) & i <= dimension / 2 - 1) || (
            (j > i || j < dimension - i - 1) & i >= dimension / 2)) {
          arr[i][j] = 0;
        } else {
          arr[i][j] = 1;
        }
      }
    }

    for (int i = 0; i < dimension; i++) {
      for (int j = 0; j < dimension; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
