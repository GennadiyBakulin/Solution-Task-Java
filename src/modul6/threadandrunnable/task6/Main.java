package modul6.threadandrunnable.task6;

public class Main {

  public static void main(String[] args) {
    Store store = new Store();
    Producer producer_1 = new Producer(store);
    Producer producer_2 = new Producer(store);
    Producer producer_3 = new Producer(store);
    Consumer consumer_1 = new Consumer(store);
    Consumer consumer_2 = new Consumer(store);

    new Thread(producer_1).start();
    new Thread(producer_2).start();
    new Thread(producer_3).start();
    new Thread(consumer_1).start();
    new Thread(consumer_2).start();
  }
}
