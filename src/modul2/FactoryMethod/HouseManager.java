package modul2.FactoryMethod;

public class HouseManager {

  public void changeState(int value, House house, IService service) {
    service.execute(value, house);
  }

}
