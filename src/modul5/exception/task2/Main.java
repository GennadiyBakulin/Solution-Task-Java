package modul5.exception.task2;

public class Main {

  public static void main(String[] args) {
    try {
      throw new MyException("Выбрасываю своё исключение");
    } catch (MyException exception) {
      System.out.println(exception.getMessage());
    }

  }

}
