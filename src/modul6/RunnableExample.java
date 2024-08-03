package modul6;

class RunnableExample implements Runnable {

  private int x, y;
  private int a = 0;

  public void run() {
    for (int i = 0; i < 500; i++) {

      synchronized (this) {
        a++;
        x = 10;
        y = 15;
//        System.out.print("a = " + a);
      }
//      System.out.print(x + " " + y + " ");
//      System.out.print("a = " + a);
    }
    System.out.print("a = " + a);
  }

  public static void main(String[] args) {
    RunnableExample run = new RunnableExample();
    Thread t1 = new Thread(run);
    Thread t2 = new Thread(run);
    t1.start();
    t2.start();
  }
}