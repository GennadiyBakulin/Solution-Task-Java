package modul5.fileIO.task3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {

  public static void main(String[] args) throws IOException {

    for (int i = 1; i <= 3; i++) {
      File dir = new File("directory_" + i);
      dir.mkdir();
    }

    File dir = new File("directory_3");

    for (int i = 1; i <= 5; i++) {
      File file = new File(dir, "file_" + i + ".txt");
      file.createNewFile();
      try (DataOutputStream os = new DataOutputStream(new FileOutputStream(file))) {
        for (int j = 0; j < 10; j++) {
          Random random = new Random();
          os.writeInt(random.nextInt());
        }
      }
    }

    File fileWithContentFromFiles = new File(dir, "filesContent.txt");

    for (File f : dir.listFiles()) {
      try (DataInputStream is = new DataInputStream(new FileInputStream(f));
          FileWriter os = new FileWriter(fileWithContentFromFiles, true)) {
        os.write("Содержимое файла " + f.getName() + ": ");
        for (int i = 0; i < 10; i++) {
          os.write(is.readInt() + " ");
        }
        os.write("\n");
      }
    }

    File listFiles = new File(dir, "listFiles.txt");

    try (FileWriter fw = new FileWriter(listFiles)) {
      fw.write("Содержимое каталога " + dir.getName() + ":\n");
      for (File f : dir.listFiles()) {
        if (f.getName().equals(listFiles.getName())) {
          continue;
        }
        fw.write(f.getName() + "\n");
      }
    }
  }
}
