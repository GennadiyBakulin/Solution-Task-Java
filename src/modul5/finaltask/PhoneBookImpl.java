package modul5.finaltask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookImpl implements PhoneBook {

  private final List<User> userList;

  public PhoneBookImpl() {
    userList = new ArrayList<>();
  }

  public List<User> getUserList() {
    return userList;
  }

  @Override
  public void addUser(String name, int number, LocalDate createdDate) throws Exception {
    for (User user : userList) {
      if (user.getName().equals(name) || user.getNumber() == number) {
        throw new Exception("Пользователь с таким именем или номером уже существует");
      }
    }
    userList.add(new User(name, number, createdDate));
  }

  @Override
  public int getNumberByName(String name) throws Exception {
    for (User user : userList) {
      if (user.getName().equals(name)) {
        return user.getNumber();
      }
    }
    throw new Exception("Пользователь с таким именем не найден");
  }

  @Override
  public String getNameByNumber(int number) throws Exception {
    for (User user : userList) {
      if (user.getNumber() == number) {
        return user.getName();
      }
    }
    throw new Exception("Пользователь с таким номером не найден");
  }

  @Override
  public void storeToFile(File phoneBookFile) throws IOException {
    if (!phoneBookFile.exists()) {
      try {
        phoneBookFile.createNewFile();
      } catch (IOException ioe) {
        throw new IOException("Не удается создать файл по указанному пути");
      }
    } else if (!phoneBookFile.isFile()) {
      throw new IOException("Указанный путь является директорией, а не файлом");
    } else if (!phoneBookFile.canWrite() || phoneBookFile.isHidden()) {
      throw new IOException("Файл по указанному пути является скрытым или защищен от записи");
    }

    try (BufferedWriter fw = new BufferedWriter(
        new FileWriter(phoneBookFile, StandardCharsets.UTF_16))) {

      for (User user : userList) {
        fw.write(user.getName() + "," + user.getNumber() + "," + user.getCreatedDate().toString()
            + "\n");
        fw.flush();
      }

    } catch (IOException e) {
      throw new IOException(e);
    }
  }

  @Override
  public void loadFromFile(File phoneBookFile) throws Exception {

    if (!phoneBookFile.exists()) {
      throw new IOException("Не удается найти файл по указанному пути");
    } else if (!phoneBookFile.isFile()) {
      throw new IOException("Указанный путь является директорией, а не файлом");
    } else if (!phoneBookFile.canRead() || phoneBookFile.isHidden()) {
      throw new IOException("Файл по указанному пути является скрытым или защищен от чтения");
    }

    try (BufferedReader fr = new BufferedReader(
        new FileReader(phoneBookFile, StandardCharsets.UTF_16))) {
      String line;

      while ((line = fr.readLine()) != null) {
        String[] user = line.split(",");
        if (user.length != 3) {
          throw new ArrayIndexOutOfBoundsException();
        }
        userList.add(new User(user[0], Integer.parseInt(user[1]), LocalDate.parse(user[2])));
      }

    } catch (NumberFormatException | DateTimeParseException |
             ArrayIndexOutOfBoundsException exception) {
      throw new Exception("Некорректный формат файла при чтении");
    } catch (IOException ioe) {
      throw new IOException(ioe);
    }
  }
}
