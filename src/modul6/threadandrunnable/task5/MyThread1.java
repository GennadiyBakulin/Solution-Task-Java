package modul6.threadandrunnable.task5;

public class MyThread1 implements Runnable {

  MyThread2 myThread2;

  @Override
  public void run() {
    this.a();
  }

  public synchronized void a() {
    System.out.println("Поток MyThread3 вошел в метод а() класса MyThread1");
    myThread2.b();
  }
}
