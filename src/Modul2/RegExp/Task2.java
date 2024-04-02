package Modul2.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

  public static void main(String[] args) {
    String str = "  dsds dfddsjjew nm,d    es    ";
    int i = 0;
    Pattern pattern = Pattern.compile("\\S+");
    Matcher matcher = pattern.matcher(str);
    while (matcher.find()) {
      i++;
    }
    System.out.println(i);
    str=str.strip();
    String[] strings = str.split(" +");
    System.out.println(strings.length);
  }

}
