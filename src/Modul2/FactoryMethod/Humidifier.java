package Modul2.FactoryMethod;

public class Humidifier implements IService {

  public void execute(int value, House house) {
    house.humidity += value;
  }

}
