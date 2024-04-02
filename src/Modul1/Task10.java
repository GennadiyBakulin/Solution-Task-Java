package Modul1;

import java.util.Scanner;

public class Task10 {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int day = scanner.nextInt();
    getTaskWeekly(day);

  }

  static void getTaskWeekly(int day) {

    switch (day) {
      case 1:
        System.out.println("Список задач на понедельник...");
        break;
      case 2:
        System.out.println("Список задач на вторник...");
        break;
      case 3:
        System.out.println("Список задач на среду...");
        break;
      case 4:
        System.out.println("Список задач на четверг...");
        break;
      case 5:
        System.out.println("Список задач на пятницу...");
        break;
      case 6:
        System.out.println("Список задач на субботу...");
        break;
      case 7:
        System.out.println("Список задач на воскресенье...");
        break;
      default:
        System.out.println("Не верно введен день недели!");
    }

  }

}
