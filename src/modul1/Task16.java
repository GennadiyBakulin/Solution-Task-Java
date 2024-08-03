package modul1;

import java.util.Scanner;

public class Task16 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int countPeople = scanner.nextInt();
    int countPartyPizza = scanner.nextInt();

    int countPizza = 1;

    while (countPizza * countPartyPizza % countPeople != 0) {
      countPizza++;
    }

    System.out.println(countPizza);
  }

}
