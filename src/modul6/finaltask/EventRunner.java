package modul6.finaltask;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventRunner {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    Map<String, Event> eventCard = new HashMap<>();
    ExecutorService pool = Executors.newFixedThreadPool(10);
    LocalDateTime dateTime = LocalDateTime.now();

    eventCard.put("Обучение Java", new Event("Обучение Java", dateTime.plusSeconds(3610),
        "Обучение языку программирования Java"));
    eventCard.put("Курс кройки",
        new Event("Курс кройки", dateTime.plusSeconds(5), "Обучение кройки и шитью"));

    for (String event : eventCard.keySet()) {
      Callable<String> eventThread = new LogicProcessingEventCard(eventCard.get(event));
      pool.submit(eventThread);
    }

    pool.shutdown();
  }
}
