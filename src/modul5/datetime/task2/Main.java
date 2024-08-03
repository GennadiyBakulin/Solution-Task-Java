package modul5.datetime.task2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    long dayNum = scanner.nextLong();

    ZoneId zoneId = ZoneId.of("Asia/Yerevan");

    LocalDateTime dateYerevanNow = LocalDateTime.now(zoneId);

    LocalDateTime dateBeforeDayNum = dateYerevanNow.minusDays(dayNum);

    System.out.println(dateBeforeDayNum.format(DateTimeFormatter.ofPattern("dd MMMM uuuu HH:mm")));

  }
}
