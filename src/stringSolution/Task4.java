package stringSolution;

public class Task4 {

  public static void main(String[] args) {
    System.out.println(new Task4().isPalindrome("accba"));
  }

  public boolean isPalindrome(String s) {

    String str = s.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
    if (str.length() % 2 == 0) {
      for (int i = 0; i < str.length() / 2; i++) {
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
          if (!(i + 1 == str.length() / 2 || str.charAt(i) == str.charAt(str.length() - i - 2)
              || str.charAt(i + 1)
              == str.charAt(str.length() - 1 - i))) {
            return false;
          }
        }
      }
    }
    if (str.length() % 2 != 0) {
      for (int i = 0; i < str.length() / 2; i++) {
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
          if (!(str.charAt(i) == str.charAt(str.length() - i - 2)
              || str.charAt(i + 1)
              == str.charAt(str.length() - 1 - i))) {
            return false;
          }
        }
      }
    }
    return true;
  }
}
