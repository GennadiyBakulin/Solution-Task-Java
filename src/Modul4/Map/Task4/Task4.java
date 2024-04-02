package Modul4.Map.Task4;

import java.util.HashMap;
import java.util.Map;

public class Task4 {

  public static void main(String[] args) {
    System.out.println(convertRomanNumberToArabianNumber("DXC"));  // 584
  }

  public static int convertRomanNumberToArabianNumber(String roman) {

    Map<Character, Integer> romanToArabian = new HashMap<>() {
      {
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
      }
    };

    if (roman.isEmpty()) {
      return 0;
    }

    if (roman.length() == 1) {
      return romanToArabian.get(roman.charAt(0));
    }

    int arabianNumber = romanToArabian.get(roman.charAt(roman.length() - 1));

    for (int i = roman.length() - 2; i >= 0; i--) {
      if (romanToArabian.get(roman.charAt(i)) < romanToArabian.get(roman.charAt(i + 1))) {
        arabianNumber -= romanToArabian.get(roman.charAt(i));
      } else {
        arabianNumber += romanToArabian.get(roman.charAt(i));
      }
    }

    return arabianNumber;
  }
}
