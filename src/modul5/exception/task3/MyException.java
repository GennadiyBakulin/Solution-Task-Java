package modul5.exception.task3;

public class MyException extends Exception {

  String message;

  public MyException(String message) {
    super(message);
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
