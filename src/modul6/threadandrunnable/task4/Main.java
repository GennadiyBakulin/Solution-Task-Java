package modul6.threadandrunnable.task4;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Thread thread_1 = new Thread(new MyThread());
    Thread thread_2 = new Thread(new MyThread());
    Thread thread_3 = new Thread(new MyThread());
    Thread thread_4 = new Thread(new MyThread());
    Thread thread_5 = new Thread(new MyThread());
    Thread thread_6 = new Thread(new MyThread());
    Thread thread_7 = new Thread(new MyThread());
    Thread thread_8 = new Thread(new MyThread());
    Thread thread_9 = new Thread(new MyThread());
    Thread thread_10 = new Thread(new MyThread());

    thread_1.start();
    thread_1.join();

    thread_2.start();
    thread_2.join();

    thread_3.start();
    thread_3.join();

    thread_4.start();
    thread_4.join();

    thread_5.start();
    thread_5.join();

    thread_6.start();
    thread_6.join();

    thread_7.start();
    thread_7.join();

    thread_8.start();
    thread_8.join();

    thread_9.start();
    thread_9.join();

    thread_10.start();
    thread_10.join();
  }
}
