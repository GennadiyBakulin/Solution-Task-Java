package StringSolution;

public class Task3 {

  public static void main(String[] args) {
    System.out.println(new Task3().isPalindrome("A man, a p_lan, a ca(nal:Panama"));
  }

  public boolean isPalindrome(String s) {

    String str = s.replaceAll("\\W|_", "").toLowerCase();
    System.out.println(str);
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

}
