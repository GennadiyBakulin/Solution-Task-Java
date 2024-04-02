package Modul2.FactoryMethod;

public class Main {

  public static void main(String[] args) {
    House house1 = new House();
    House house2 = new House();
    HouseManager houseManager = new HouseManager();
    houseManager.changeState(5, house1, new Heater());
    houseManager.changeState(15, house2, new Humidifier());
    System.out.println(house1.heater + " " + house1.humidity);
    System.out.println(house2.heater + " " + house2.humidity);
  }
}
