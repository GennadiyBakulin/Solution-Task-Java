package Modul4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {

  public static void main(String[] args) {
    List<Integer> scores = new ArrayList<>(100);
    ThreadLocalRandom price = ThreadLocalRandom.current();

    for (int i = 0; i < 100; i++) {
      scores.add(price.nextInt(1, 6));
    }

    scores.removeIf(score -> score < 4);

    System.out.println(scores);

    int scoreMax = 0;

    for (int score : scores) {
      if (score > scoreMax) {
        scoreMax = score;
      }
    }
    System.out.println(scoreMax);

  }

}
