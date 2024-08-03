package modul6.finaltask;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;

public class LogicProcessingEventCard implements Callable<String> {

  private final Event event;

  public LogicProcessingEventCard(Event event) {
    this.event = event;
  }

  @Override
  public String call() throws InterruptedException {

    long seconds;

    if ((seconds = Duration.between(LocalDateTime.now(), event.getDate()).toSeconds())
        > 3600) {
      Thread.sleep((seconds - 3600) * 1000);
    }

    while ((seconds = Duration.between(LocalDateTime.now(), event.getDate()).toSeconds()) > 0) {
      System.out.println("Event " + event.getName() + " will start in " + seconds + " seconds");
      Thread.sleep(1000);
    }

    if (Duration.between(LocalDateTime.now(), event.getDate()).toSeconds() <= 0) {
      event.setActive(true);
      System.out.println("Notification! Event " + event.getName() + " begins!");
    }

    while (event.isActive()) {
      System.out.println("Event " + event.getName() + " has already started!");
      Thread.sleep(60000);
    }

    return "";
  }
}
