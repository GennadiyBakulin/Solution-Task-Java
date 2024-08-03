package modul4.FinalTask;

import java.util.HashMap;
import java.util.Map;

public class Basket {

  private final Map<Product, Integer> productList;

  public Basket() {
    productList = new HashMap<>();
  }

  public Map<Product, Integer> getProductList() {
    return productList;
  }

  @Override
  public String toString() {
    return "Basket{" +
        "productList=" + productList +
        '}';
  }
}
