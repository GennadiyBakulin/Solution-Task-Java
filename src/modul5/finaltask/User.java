package modul5.finaltask;

import java.time.LocalDate;

public class User {

  private final String name;
  private final int number;
  private final LocalDate createdDate;

  public User(String name, int number, LocalDate createdDate) {
    this.name = name;
    this.number = number;
    this.createdDate = createdDate;
  }

  public String getName() {
    return name;
  }

  public int getNumber() {
    return number;
  }

  public LocalDate getCreatedDate() {
    return createdDate;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", number=" + number +
        ", createdDate=" + createdDate +
        '}';
  }
}
