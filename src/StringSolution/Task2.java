package StringSolution;

public class Task2 {

  public static void main(String[] args) {
    String strResult = "";

    long startString = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
      strResult +="aaabbbccc";
    }
    long endString = System.currentTimeMillis();

    System.out.println(endString - startString);

    StringBuilder strBuilder = new StringBuilder();

    long startStringBuilder = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
      strBuilder.append("aaabbbccc");
    }
    long endStringBuilder = System.currentTimeMillis();

    System.out.println(endStringBuilder - startStringBuilder);

  }

}
