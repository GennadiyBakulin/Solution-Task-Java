package modul4.SortedCollections.Task2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Map<String, Integer> nonSortedMap = Map.of(
        "two", 2,
        "five", 5,
        "three", 3,
        "one", 1,
        "four", 4
    );

    System.out.println(sortByValue(nonSortedMap));
  }

  public static Map<String, Integer> sortByValue(Map<String, Integer> nonSortedMap) {

    List<Map.Entry<String, Integer>> list = new ArrayList<>(nonSortedMap.entrySet());

    SortedMapByValueComparator sortedMapByValueComparator = new SortedMapByValueComparator();

    list.sort(sortedMapByValueComparator);

    LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

    for (Map.Entry<String, Integer> entry : list) {
      sortedMap.put(entry.getKey(), entry.getValue());
    }

    return sortedMap;
  }
}
