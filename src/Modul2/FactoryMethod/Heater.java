package Modul2.FactoryMethod;

public class Heater implements IService {

  public void execute(int value, House house) {
    house.heater += value;
  }

}
