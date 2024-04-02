package Modul2;

public class MyMath {

  public int numerator;
  public int denominator;

  public MyMath(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public String showFraction() {
    return numerator + "/" + denominator;
  }

  public double multiply(double number) {
    return number * numerator / denominator;
  }

  public double divide(double number) {
    return (double) numerator / denominator / number;
  }

}
