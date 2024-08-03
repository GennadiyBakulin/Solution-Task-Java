package modul5.fileIO.task1;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.print("Введите директорию для вывода на экран: ");
    Scanner scanner = new Scanner(System.in);
    outputCatalog(scanner.nextLine());
  }

  public static void outputCatalog(String name) {
    outputCatalog(name, 0);
  }

  public static void outputCatalog(String name, int tab) {
    File dir = new File(name);
    List<File> fileList = Arrays.asList(dir.listFiles());
    fileList.sort((a, b) -> {
      if (a.isDirectory()) {
        return 1;
      }
      return -1;
    });

    for (File file : fileList) {
      if (file.isDirectory()) {
        System.out.println(" ".repeat(tab) + "\\" + file.getName() + "\\");
        outputCatalog(file.getAbsolutePath(), tab + 4);
      } else {
        System.out.println(" ".repeat(tab) + file.getName());
      }
    }
  }

}
