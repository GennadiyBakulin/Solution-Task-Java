package Modul4.Map.Task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

  public static void main(String[] args) {
    System.out.println(getCharsCount(
        "Practicing your comprehension of written English of will both improve your vocabulary and understanding of grammar and word order"));
  }

  public static Map<Character, Integer> getCharsCount(String s) {

    Map<Character, Integer> charsCount = new HashMap<>();

    String[] words = s.split(" +");

    for (String word : words) {

      for (int i = 0; i < word.length(); i++) {
        if (charsCount.containsKey(word.charAt(i))) {
          int count = charsCount.get(word.charAt(i));
          charsCount.put(word.charAt(i), ++count);
        } else {
          charsCount.put(word.charAt(i), 0);
        }
      }
    }

    return charsCount;
  }

}
