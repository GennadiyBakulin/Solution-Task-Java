package modul5.finaltask;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public interface PhoneBook {

  void addUser(String name, int number, LocalDate createdDate) throws Exception;

  int getNumberByName(String name) throws Exception;

  String getNameByNumber(int number) throws Exception;

  void storeToFile(File phoneBookFile) throws IOException;

  void loadFromFile(File phoneBookFile) throws Exception;

}
