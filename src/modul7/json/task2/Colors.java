package modul7.json.task2;

import java.util.Arrays;

public class Colors {

  private Color[] colors;

  public Color[] getColors() {
    return colors;
  }

  public void setColors(Color[] colors) {
    this.colors = colors;
  }

  @Override
  public String toString() {
    return "Colors{" +
        "colors=" + Arrays.toString(colors) +
        '}';
  }
}
