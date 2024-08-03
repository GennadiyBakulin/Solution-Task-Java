package modul4.Map.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task5 {

  public static void main(String[] args) {
    System.out.println(convertArabianToRomanNumberNumber(999));  // 584
  }

  public static String convertArabianToRomanNumberNumber(int number) {

    if (number <= 0) {
      return "Не определено";
    }
    Map<Integer, String> arabianToRoman = new TreeMap<>() {
      {
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
      }
    };

    List<Integer> keyMapList = new ArrayList<>(arabianToRoman.keySet());

    StringBuilder romanNumber = new StringBuilder();

    for (int i = keyMapList.size() - 1; i >= 0; i--) {

      while (number >= keyMapList.get(i)) {
        romanNumber.append(arabianToRoman.get(keyMapList.get(i)));
        number -= keyMapList.get(i);
      }

    }

    return romanNumber.toString();
  }

}
