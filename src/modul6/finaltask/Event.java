package modul6.finaltask;

import java.time.LocalDateTime;

public class Event {

  private final String name;
  private final LocalDateTime date;
  private final String description;
  private boolean isActive = false;

  public Event(String name, LocalDateTime date, String description) {
    this.name = name;
    this.date = date;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  @Override
  public String toString() {
    return "Event{" +
        "name='" + name + '\'' +
        ", date=" + date +
        ", description='" + description + '\'' +
        '}';
  }
}
