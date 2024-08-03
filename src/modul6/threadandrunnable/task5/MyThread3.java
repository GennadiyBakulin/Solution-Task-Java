package modul6.threadandrunnable.task5;

public class MyThread3 implements Runnable {

  MyThread1 myThread1;

  @Override
  public void run() {
    this.c();

  }

  public synchronized void c() {
    System.out.println("Поток MyThread1 вошел в метод c() класса MyThread3");
    myThread1.a();
  }
}
