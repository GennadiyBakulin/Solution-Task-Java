package StringSolution;

public class Task1 {

  public static void main(String[] args) {
    workString("I like Java!!!");
  }

  static void workString(String str) {
    System.out.println(str.charAt(str.length() - 1));
    System.out.println(str.endsWith("!!!"));
    System.out.println(str.startsWith("I like"));
    System.out.println(str.contains("Java"));
    System.out.println(str.indexOf("Java"));
    System.out.println(str.replace('a', 'o'));
    System.out.println(str.toUpperCase());
    System.out.println(str.substring(0, str.indexOf("Java") - 1) + str.substring(
        str.indexOf("Java") + "Java".length()));
  }
}
