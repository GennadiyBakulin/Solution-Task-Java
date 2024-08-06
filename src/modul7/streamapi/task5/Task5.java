package modul7.streamapi.task5;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Task5 {

  public static void main(String[] args) {
    final AtomicInteger i = new AtomicInteger(0);
//    List<String> list = Stream.generate(() ->
//            new Person("name" + i.incrementAndGet(),
//                "surName" + i.get(),
//                new Random().nextInt(15, 31)))
//        .limit(100)
//        .filter(person -> person.getAge() < 21)
//        .peek(System.out::println)
//        .sorted(Comparator.comparing(Person::getSurName)
//            .thenComparing(Person::getName))
//        .limit(4)
//        .flatMap(x -> Stream.of(x.getSurName()))
//        .toList();

    List<String> list = Stream.generate(() ->
            new Person("name" + i.incrementAndGet(),
                "surName" + i.get(),
                new Random().nextInt(15, 31)))
        .limit(100)
        .filter(person -> person.getAge() < 21)
        .peek(System.out::println)
        .sorted(Comparator.comparing(Person::getSurName)
            .thenComparing(Person::getName))
        .limit(4)
        .map(x -> x.getSurName())
        .toList();

    System.out.println(list);
  }
}
