package modul4.FinalTask;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ProductPriceComparator implements Comparator<Map.Entry<Product, Integer>> {

  @Override
  public int compare(Entry<Product, Integer> o1, Entry<Product, Integer> o2) {
    if (o1.getKey().getPrice() > o2.getKey().getPrice()) {
      return 1;
    } else if (o1.getKey().getPrice() < o2.getKey().getPrice()) {
      return -1;
    } else {
      return 0;
    }
  }
}
