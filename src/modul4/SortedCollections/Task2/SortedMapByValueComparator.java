package modul4.SortedCollections.Task2;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class SortedMapByValueComparator implements Comparator<Map.Entry<String, Integer>> {

  @Override
  public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
    if (o1.getValue() > o2.getValue()) {
      return 1;
    } else if (o1.getValue() < o2.getValue()) {
      return -1;
    }
    return 0;
  }
}
