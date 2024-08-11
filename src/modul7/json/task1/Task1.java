package modul7.json.task1;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

public class Task1 {

  public static void main(String[] args) throws IOException {
    byte[] bytes = ClassLoader.getSystemResourceAsStream("modul7\\json\\file.json").readAllBytes();
    ObjectMapper objectMapper = new ObjectMapper();
    Person person = objectMapper.readValue(bytes, Person.class);
    System.out.println(person);
    System.out.println(person.getAddress());
    person.setName("Aleysk");
    objectMapper.writeValue(new File("p:\\fileOutput.json"),person);
  }
}
