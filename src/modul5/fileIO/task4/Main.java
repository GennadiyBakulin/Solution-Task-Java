package modul5.fileIO.task4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

  public static void main(String[] args) {
    Person person_1 = new Person("Name_1", "Surname_1", 1);
    Person person_2 = new Person("Name_2", "Surname_2", 2);
    Person person_3 = new Person("Name_3", "Surname_3", 3);
    Person person_4 = new Person("Name_4", "Surname_4", 4);
    Person person_5 = new Person("Name_5", "Surname_5", 5);
    Person person_6 = new Person("Name_6", "Surname_6", 6);
    Person person_7 = new Person("Name_7", "Surname_7", 7);
    Person person_8 = new Person("Name_8", "Surname_8", 8);
    Person person_9 = new Person("Name_9", "Surname_9", 9);
    Person person_10 = new Person("Name_10", "Surname_10", 10);

    File persons = new File("Persons.txt");

    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(persons));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(persons))) {

      oos.writeObject(person_1);
      oos.writeObject(person_2);
      oos.writeObject(person_3);
      oos.writeObject(person_4);
      oos.writeObject(person_5);
      oos.writeObject(person_6);
      oos.writeObject(person_7);
      oos.writeObject(person_8);
      oos.writeObject(person_9);
      oos.writeObject(person_10);

      for (int i = 1; i <= 10; i++) {
        System.out.println(ois.readObject());
      }
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

  }
}
