package modul7.lambda.task1;

import java.util.function.Predicate;

public class Task1 {

  public static void main(String[] args) {
    String str1 = null;
    String str2 = "";
    String str3 = "NnsasAD";
    Predicate<String> isNotNull = string -> string != null;
    Predicate<String> isNotEmpty = string -> !string.isEmpty();
    Predicate<String> isStringStartsWithLetterJ = string -> string.startsWith("J");
    Predicate<String> isStringStartsWithLetterN = string -> string.startsWith("N");
    Predicate<String> isStringEndsWithLetterA = string -> string.endsWith("A");
    System.out.println(isNotNull.test(str1));
    System.out.println(isNotEmpty.test(str2));
    System.out.println(
        isStringStartsWithLetterJ
            .or(isStringStartsWithLetterN)
            .and(isStringEndsWithLetterA)
            .test(str3));
  }
}
