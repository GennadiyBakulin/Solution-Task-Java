package modul6.threadandrunnable.task1;

public class Main {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      new Thread(new MyRunnable()).start();
    }
  }

}
