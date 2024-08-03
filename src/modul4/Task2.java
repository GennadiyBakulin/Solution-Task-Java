package modul4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Task2 {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(50);

    Random random = new Random();

    for (int i = 0; i < 50; i++) {
      list.add(random.nextInt(40));
    }

    System.out.println(list);

    Set<Integer> set = new HashSet<>(list);

    System.out.println(set);

  }

}
