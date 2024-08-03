package modul6.threadandrunnable.task5;

public class Main {

  public static void main(String[] args) {
    MyThread1 myThread1 = new MyThread1();
    MyThread2 myThread2 = new MyThread2();
    MyThread3 myThread3 = new MyThread3();
    myThread1.myThread2 = myThread2;
    myThread2.myThread3 = myThread3;
    myThread3.myThread1 = myThread1;

    new Thread(myThread1).start();
    new Thread(myThread2).start();
    new Thread(myThread3).start();

  }
}
