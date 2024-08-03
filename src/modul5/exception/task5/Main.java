package modul5.exception.task5;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int minNumber = 1;
    int maxNumber = 100;
    int randomNumber = new Random().nextInt(minNumber, maxNumber + 1);
    int numberOfAttempts = 5;
    int number;
    System.out.println("Система загадала число в интервале от " + minNumber + " до " + maxNumber);
    System.out.println("Вам дано " + numberOfAttempts + " попыток чтобы отгадать это число.");
    System.out.println("------------------------------------------------------------------");

    while (true) {

      System.out.println(
          "Пожалуйста введите число от " + minNumber + " до "
              + maxNumber + ": ");

      while (true) {
        String input = new Scanner(System.in).nextLine();

        try {

          number = Integer.parseInt(input);

        } catch (NumberFormatException exception) {
          System.out.println(
              "Вы ввели не число! Пожалуйста введите число от " + minNumber + " до " + maxNumber
                  + ": ");
          continue;
        }

        if (number < minNumber || number > maxNumber) {
          System.out.println(
              "Введенное число некорректно! Пожалуйста введите число от " + minNumber + " до "
                  + maxNumber + ": ");
          continue;
        }

        break;
      }

      if (number == randomNumber) {
        System.out.println("Молодец число угадано!");
        break;
      }

      --numberOfAttempts;

      if (numberOfAttempts == 0) {
        System.out.println("Увы Вы проиграли!!!");
        break;
      }

      if (number < randomNumber) {
        System.out.println("Не верно - искомое число больше введенного");
      } else {
        System.out.println("Не верно - искомое число меньше введенного");
      }

      System.out.println("-----------------------------------------------------");
      System.out.println("Кол-во оставшихся попыток - " + numberOfAttempts);
      System.out.println("-----------------------------------------------------");
    }

  }

}
