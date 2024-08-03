package modul5.finaltask;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class Main {

  public static void main(String[] args) throws Exception {

    PhoneBook phoneBook = new PhoneBookImpl();
    phoneBook.addUser("Ivan", 123, LocalDate.now());
    phoneBook.addUser("Petr", 345, LocalDate.now());
    phoneBook.storeToFile(new File("P:\\JavaGuru\\JavaBase\\Modul1\\m\\f.txt"));

    PhoneBookImpl phoneBook2 = new PhoneBookImpl();
    phoneBook2.loadFromFile(new File("P:\\JavaGuru\\JavaBase\\Modul1\\m\\f.txt"));

    System.out.println(phoneBook.getNameByNumber(123).equals("Ivan"));
    System.out.println(phoneBook.getNumberByName("Petr") == 345);
    System.out.println(phoneBook2.getUserList());

  }
}
