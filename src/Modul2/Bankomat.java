package Modul2;

import java.util.Scanner;

public class Bankomat {

  int banknote20;
  int banknote50;
  int banknote100;

  public Bankomat(int banknote20, int banknote50, int banknote100) {
    this.banknote20 = banknote20;
    this.banknote50 = banknote50;
    this.banknote100 = banknote100;
  }

  public void addBanknote20(int count) {
    this.banknote20 += count;
  }

  public void addBanknote50(int count) {
    this.banknote50 += count;
  }

  public void addBanknote100(int count) {
    this.banknote100 += count;
  }

  public String takeMoneyFromBankomat(int money) {
    if (money > (this.banknote20 * 20 + this.banknote50 * 50 + this.banknote100 * 100)
        || money % 10 != 0) {
      return "Операция не удалась";
    }

    int countBanknote100 = 0;
    int countBanknote50 = 0;
    int countBanknote20;

    while (money >= 100 & this.banknote100 != 0) {
      countBanknote100++;
      this.banknote100--;
      money -= 100;
      if (money == 30 || money == 10) {
        countBanknote100--;
        this.banknote100++;
        money += 100;
        break;
      }
    }

    while (money >= 50 & this.banknote50 != 0) {
      countBanknote50++;
      this.banknote50--;
      money -= 50;
      if (money == 30 || money == 10) {
        countBanknote50--;
        this.banknote50++;
        money += 50;
        break;
      }
    }

    if (money < 20) {
      return "Операция не удалась";
    }

    countBanknote20 = money / 20;

    if (this.banknote20 < countBanknote20) {
      return "Операция не удалась";
    }

    return "Операция удалась!!!\nВыдано:\nкупюр номиналом 100: " + countBanknote100 + "\nкупюр номиналом 50: "
        + countBanknote50 + "\nкупюр номиналом 20: " + countBanknote20;
  }

  public static void main(String[] args) {
    Bankomat bankomat = new Bankomat(10, 5, 1);
    Scanner scanner = new Scanner(System.in);
    int money = scanner.nextInt();

    System.out.println(bankomat.takeMoneyFromBankomat(money));
  }
}
