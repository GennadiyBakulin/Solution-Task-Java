package modul5.exception.task4;

public class Test {

  public static void main(String[] args) {
    Division division = new Division();

    System.out.println(division.divide("10", "0"));
    System.out.println(division.divide());
    System.out.println(division.divide(null));
    System.out.println(division.divide("2.3"));
    System.out.println(division.divide("20", "df"));

  }

}
