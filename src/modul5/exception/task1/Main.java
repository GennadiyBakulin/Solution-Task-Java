package modul5.exception.task1;

public class Main {

  public static void main(String[] args) {
    String str = null;

    try {
      System.out.println(str.toString());
    } catch (NullPointerException npe) {
      System.out.println(npe.getMessage());
    }

  }

}
