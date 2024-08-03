package modul4.FinalTask;

public class Test {
  public static void main(String[] args) {
    Manager manager = new Manager();
    Product ball = new Product("Ball", 150.0);
    Product ball2 = new Product("Ball", 200.0);
    Product car = new Product("Car", 1000.0);
    Product milk = new Product("Milk", 10.0);
    Product milk2 = new Product("Milk", 8.0);
    Product cheese = new Product("Cheese", 10.0);

    manager.addProductToBasket(ball2, 2);
    manager.addProductToBasket(ball, 3);
    manager.addProductToBasket(car, 1);
    manager.addProductToBasket(milk, 10);
    manager.addProductToBasket(milk2, 3);
    manager.addProductToBasket(cheese, 2);
    manager.addProductToBasket(car, 1);

    System.out.println(
        "-------Вывод списка товаров в корзине и общей суммы к оплате.--------------");
    manager.getBasketAndTotalAmount();
    System.out.println("-------Сортировка по имени товара в корзине--------------");
    manager.getBasket("name");
    System.out.println("--------Сортировка по цене товара в корзине-------------");
    manager.getBasket("price");
    System.out.println(
        "--------Сортировка снчала по имени товара, потом по цене товара в корзине-------------");
    manager.getBasket("nameToPrice");
    System.out.println("--------Задание не верного критерия сортировки---------");
    manager.getBasket("some");
  }

}
