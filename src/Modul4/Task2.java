package Modul4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(50);
    ThreadLocalRandom price = ThreadLocalRandom.current();

    for (int i = 0; i < 50; i++) {
      numbers.add(price.nextInt(50));
    }

    System.out.println(numbers);

    Set<Integer> numbersUnique = new LinkedHashSet<>(numbers);

    System.out.println(numbersUnique);

  }

}
