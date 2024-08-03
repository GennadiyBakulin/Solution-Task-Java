package modul5.exception.task4;

public class Division {

  public Double divide(String... arguments) {
    try {
      int result = Integer.parseInt(arguments[0]);
      for (int i = 1; i < arguments.length; i++) {
        result /= Integer.parseInt(arguments[i]);
      }
      return (double) result;
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException |
             NullPointerException e) {
      System.out.println("Ошибка " + e.getClass() + " -> " + e.getMessage());
      throw e;
    }

  }

}
