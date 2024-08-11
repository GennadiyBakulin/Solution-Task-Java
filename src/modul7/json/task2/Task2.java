package modul7.json.task2;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

public class Task2 {

  public static void main(String[] args) throws IOException {
    byte[] readAllBytes = ClassLoader.getSystemResourceAsStream("modul7/json/file2.json")
        .readAllBytes();
    ObjectMapper objectMapper = new ObjectMapper();
    Colors colors = objectMapper.readValue(readAllBytes, Colors.class);
    System.out.println(colors);
  }
}
