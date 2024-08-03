package modul5.datetime.task1;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int month = scanner.nextInt();

    int year = Year.now().getValue();
    YearMonth yearMonth = YearMonth.of(year, month);

    for (int i = 1; i <= yearMonth.lengthOfMonth(); i++) {
      System.out.println(
          LocalDate.of(year, month, i).format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
    }

  }
}
