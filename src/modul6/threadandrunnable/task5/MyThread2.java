package modul6.threadandrunnable.task5;

public class MyThread2 implements Runnable {

  MyThread3 myThread3;

  @Override
  public void run() {
    this.b();
  }

  public synchronized void b() {
    System.out.println("Поток MyThread3 вошел в метод b() класса MyThread2");
    myThread3.c();
  }
}
