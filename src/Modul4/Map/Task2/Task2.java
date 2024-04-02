package Modul4.Map.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] text = scanner.nextLine().split(" +");

    Map<String, Integer> duplicatesWords = new HashMap<>();

    for (String word : text) {

      if (duplicatesWords.containsKey(word)) {
        int count = duplicatesWords.get(word);
        duplicatesWords.put(word, ++count);
      } else {
        duplicatesWords.put(word, 0);
      }
    }

    for (Map.Entry<String, Integer> words : duplicatesWords.entrySet()) {
      System.out.println(words.getKey() + " : " + words.getValue());
    }

  }

}
