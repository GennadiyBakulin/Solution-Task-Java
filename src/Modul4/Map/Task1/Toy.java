package Modul4.Map.Task1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Toy {

  String name;
  int age;
  int price;

  public Toy(String name, int age, int price) {
    this.name = name;
    this.age = age;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Toy{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", price=" + price +
        '}';
  }

  public static void main(String[] args) {

    Map<String, Toy> products = new HashMap<>();

    Toy barby = new Toy("barby", 2, 1000);
    products.put(barby.name, barby);

    Toy auto = new Toy("auto", 3, 1500);
    products.put(auto.name, auto);

    Toy ball = new Toy("ball", 5, 600);
    products.put(ball.name, ball);

    for (Map.Entry<String, Toy> product : products.entrySet()) {
      System.out.println(product.getKey() + "  :  " + product.getValue());
    }

    Set<String> productsName = products.keySet();
    Collection<Toy> productsValue = products.values();

    for (String a : productsName) {
      System.out.println(a);
    }

    for (Toy toy : productsValue) {
      System.out.println(toy);
    }
  }
}
