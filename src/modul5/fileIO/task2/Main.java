package modul5.fileIO.task2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    File f = new File("text.txt");

    try (FileWriter writer = new FileWriter(f)) {
      writer.write(
          "Он, однако, не то чтобы был... совсем в беспамятстве во всё время болезни:\n"
              + "это было лихорадочное состояние, с бредом и полусознанием. Многое он потом припомнил.\n"
              + "То казалось ему, что около него собирается много народу и очень об нем спорят и ссорятся.\n"
              + "То вдруг он один в комнате, все ушли и боятся его, и только изредка отворяют дверь посмотреть на него,\n"
              + "грозят ему, сговариваются промеж себя, смеются и дразнят его.\n"
              + "Настасью он часто помнил подле себя; различал и еще одного человека, очень будто бы ему знакомого,\n"
              + "но кого именно - никак не мог догадаться и тосковал об этом, даже и плакал.\n"
              + "Иной раз казалось ему, что он уже с месяц лежит; в другой раз - что всё тот же день идет.\n"
              + "Тогда он порывался с места... хотел бежать, но всегда его останавливали силой, и он опять впадал в бессилие и беспамятство.\n"
              + "Наконец он совсем пришел в себя.");
    }

    try (FileReader reader = new FileReader(f)) {
      Scanner scanner = new Scanner(reader);
      String ellipsis = "[.]{3}";
      String punct = "[-.,;:!?`\"()]";
      String splitByWords = "[^a-zA-Zа-яёА-ЯЁ]+";

      int countPunct = 0;
      int countWord = 0;

      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        countPunct +=
            line.length() - line.replaceAll(ellipsis, "  ").replaceAll(punct, "").length();
        countWord += line.split(splitByWords).length;
      }

      System.out.printf(
          "Количество слов в тексте - %d\nКоличество знаков препинания в тексте из набора %s - %d",
          countWord, "[-.,;:!?`\"()...]", countPunct);
    }

  }
}
