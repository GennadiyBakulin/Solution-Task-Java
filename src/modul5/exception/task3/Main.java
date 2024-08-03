package modul5.exception.task3;

public class Main {

  public static void main(String[] args) {

    try {
      generateException();
    } catch (MyException exception) {
      System.out.println(exception.getMessage());
    }

  }

  private static void generateException() throws MyException {
    throw new MyException("Выбрасываю из метода своё исключение");
  }

}
