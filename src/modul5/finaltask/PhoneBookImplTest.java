package modul5.finaltask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhoneBookImplTest {

  PhoneBookImpl phoneBook = new PhoneBookImpl();

  @BeforeEach
  void setUp() throws Exception {
    phoneBook.addUser("Ivan", 123, LocalDate.now());
    phoneBook.addUser("Petr", 345, LocalDate.now());
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void addUserIfExists() throws Exception {
    Throwable exception = assertThrows(Exception.class, () -> {
      phoneBook.addUser("Ivan", 123, LocalDate.now());
    });
    assertEquals("Пользователь с таким именем или номером уже существует", exception.getMessage());
  }

  @Test
  void addUserIfNotExists() throws Exception {
    int expected = phoneBook.getUserList().size() + 1;
    phoneBook.addUser("Ivan2", 12, LocalDate.now());
    int actually = phoneBook.getUserList().size();

    assertEquals(expected, actually);
  }

  @Test
  void getNumberByNameIfNameNotExists() {
    Throwable exception = assertThrows(Exception.class, () -> {
      phoneBook.getNumberByName("Pavel");
    });
    assertEquals("Пользователь с таким именем не найден", exception.getMessage());
  }

  @Test
  void getNumberByNameIfNameExists() throws Exception {
    int actually = phoneBook.getNumberByName("Petr");
    assertEquals(345, actually);
  }

  @Test
  void getNameByNumberIfNumberNotExists() {
    Throwable exception = assertThrows(Exception.class, () -> {
      phoneBook.getNameByNumber(500);
    });
    assertEquals("Пользователь с таким номером не найден", exception.getMessage());
  }

  @Test
  void getNameByNumberIfNumberExists() throws Exception {
    String actually = phoneBook.getNameByNumber(345);
    assertEquals("Petr", actually);
  }

}