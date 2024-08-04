package modul7.streamapi;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

  public static void main(String[] args) {
    Collection<String> col = List.of("Hel lo", "Na me rew", "Sup.ere st", "Boss", "login,", ",word");
    boolean login = col.stream().anyMatch(str -> str.equals("login"));
    System.out.println(login);
    System.out.println(col.stream().max((str1, str2) -> str1.length() - str2.length()).get());
    System.out.println(
        col.stream().sorted((str1, str2) -> str2.length() - str1.length()).findFirst().get());
    System.out.println(col.stream().min((str1, str2) -> str1.length() - str2.length()).get());
    System.out.println(col.stream().filter(x -> !x.matches(".*[ .,].*")).toList());
    System.out.println(
        col.stream().flatMap(line -> Stream.of(line.split(" "))).collect(Collectors.toList()));
  }
}
