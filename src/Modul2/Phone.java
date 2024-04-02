package Modul2;

public class Phone {

  public String number;
  public String model;
  public double weight;

  public Phone(String number, String model, double weight) {
    this.number = number;
    this.model = model;
    this.weight = weight;
  }

  public void receiveCall(String name) {
    System.out.println("Звонит " + name);
  }

  public void receiveCall(String name, String number) {
    System.out.println("Звонит " + name + " " + number);
  }

  public void SendMessage(String[] numbers) {
    for (String number : numbers) {
      System.out.println(number);
    }
  }

  public String getNumber() {
    return this.number;
  }

  @Override
  public String toString() {
    return " " +
        "number=" + number +
        ", model='" + model + '\'' +
        ", weight=" + weight;
  }

  public static void main(String[] args) {
    Phone nokia = new Phone("89523694212", "A3", 0.2);
    Phone simens = new Phone("8842135862", "sass", 0.3);
    Phone lg = new Phone("84256325899", "kort", 0.25);
    System.out.println("nokia:" + nokia);
    System.out.println("lg:" + lg);
    System.out.println("simens:" + simens);

    nokia.receiveCall("Anton");
    lg.receiveCall("Timur");
    simens.receiveCall("Vlad");

    System.out.println(nokia.getNumber());
    System.out.println(lg.getNumber());
    System.out.println(simens.getNumber());

    nokia.receiveCall("Anton", "84523698595");
    lg.receiveCall("Timur", "89134567852");
    simens.receiveCall("Vlad", "89065287962");

  }

}
