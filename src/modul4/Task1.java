package modul4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task1 {

  public static void main(String[] args) {
    ArrayList<Integer> scores = new ArrayList<>(100);

    Random random = new Random();

    for (int i = 0; i < 100; i++) {
      scores.add(random.nextInt(1, 6));
    }

    Iterator<Integer> scoreIterator = scores.iterator();

    int badScore = 2;

    while (scoreIterator.hasNext()) {
      if (scoreIterator.next() <= badScore) {
        scoreIterator.remove();
      }
    }

    System.out.println(scores);

    Iterator<Integer> scoreIteratorWithOutBadScores = scores.iterator();

    int maxScore = scoreIteratorWithOutBadScores.next();

    while (scoreIteratorWithOutBadScores.hasNext()) {
      int score = scoreIteratorWithOutBadScores.next();
      if (score > maxScore) {
        maxScore = score;
      }
    }

    System.out.println(maxScore);

  }

}
