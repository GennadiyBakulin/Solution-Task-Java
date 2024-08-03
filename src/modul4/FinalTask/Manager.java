package modul4.FinalTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Manager {

  private final Basket basket;

  public Manager() {
    basket = new Basket();
  }

  public void addProductToBasket(Product product, Integer count) {
    if (basket.getProductList().containsKey(product)) {
      basket.getProductList().put(product, count + basket.getProductList().get(product));
    } else {
      basket.getProductList().put(product, count);
    }
  }

  public void getBasketAndTotalAmount() {
    double totalAmount = 0.0;
    for (Map.Entry<Product, Integer> entry : basket.getProductList().entrySet()) {
      totalAmount += (entry.getKey()).getPrice() * entry.getValue();
      System.out.println(
          (entry.getKey()).getName() + " цена " + (entry.getKey()).getPrice() + " руб. в кол-ве "
              + entry.getValue() + " шт." + " = " + (entry.getKey()).getPrice() * entry.getValue()
              + " руб.");
    }
    System.out.println("Итоговая сумма заказа: " + totalAmount + " руб.");
  }

  public void getBasket(String sortCriterion) {
    switch (sortCriterion) {
      case "name": {
        ProductNameComparator productNameComparator = new ProductNameComparator();
        List<Map.Entry<Product, Integer>> sortedList = new ArrayList<>(
            basket.getProductList().entrySet());
        sortedList.sort(productNameComparator);
        showSortedMap(sortedList);
        break;
      }
      case "price": {
        ProductPriceComparator productPriceComparator = new ProductPriceComparator();
        List<Map.Entry<Product, Integer>> sortedList = new ArrayList<>(
            basket.getProductList().entrySet());
        sortedList.sort(productPriceComparator);
        showSortedMap(sortedList);
        break;
      }
      case "nameToPrice": {
        ProductNameComparator productNameComparator = new ProductNameComparator();
        ProductPriceComparator productPriceComparator = new ProductPriceComparator();
        List<Map.Entry<Product, Integer>> sortedList = new ArrayList<>(
            basket.getProductList().entrySet());
        sortedList.sort(productNameComparator.thenComparing(productPriceComparator));
        showSortedMap(sortedList);
        break;
      }
      default:
        System.out.println("Не верно задан критерий сортировки!");
    }
  }

  public void showSortedMap(List<Map.Entry<Product, Integer>> sortedList) {
    for (Map.Entry<Product, Integer> entry : sortedList) {
      System.out.println(
          (entry.getKey()).getName() + " цена " + (entry.getKey()).getPrice() + " руб. в кол-ве "
              + entry.getValue() + " шт.");
    }
  }

  @Override
  public String toString() {
    return "Manager{" +
        "basket=" + basket +
        '}';
  }
}
