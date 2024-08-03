package modul4.FinalTask;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ProductNameComparator implements Comparator<Map.Entry<Product, Integer>> {

  @Override
  public int compare(Entry<Product, Integer> o1, Entry<Product, Integer> o2) {
    return o1.getKey().getName().compareTo(o2.getKey().getName());
  }
}
