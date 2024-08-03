package modul2.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

  public static void main(String[] args) {
    String str = "d, lf.flsofnf?, d.^jd.";
    int i = 0;
    Pattern pattern = Pattern.compile("[^\\w ]");
    Matcher matcher = pattern.matcher(str);
    while (matcher.find()) {
      i++;
    }
    System.out.println(i);
  }
}
