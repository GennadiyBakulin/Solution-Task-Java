package modul6.threadandrunnable.task2;

public class Main {

  public static void main(String[] args) {
    new Thread(new MyThread()).start();
    new Thread(new MyThread()).start();
    new Thread(new MyThread()).start();
    new Thread(new MyThread()).start();
    new Thread(new MyThread()).start();
  }
}
