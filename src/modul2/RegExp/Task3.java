package modul2.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

  public static void main(String[] args) {
    String str = "As we can see, in the old implementation, using two iterations, the index of the first non-space is calculated first, and then the index of the last non-space.";

    Pattern pattern = Pattern.compile(".{1}\\W+");
    Matcher matcher = pattern.matcher(str);
    while (matcher.find()) {
      System.out.print(matcher.group().charAt(0));
    }
  }
}
