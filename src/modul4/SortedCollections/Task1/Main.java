package modul4.SortedCollections.Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Student> studentList = new ArrayList<>();

    studentList.add(new Student("Petr", "1A", 4.1));
    studentList.add(new Student("Alice", "1A", 3.2));
    studentList.add(new Student("Alexandr", "1A", 3.8));
    studentList.add(new Student("Kirill", "1B", 2.7));
    studentList.add(new Student("Olga", "1B", 4.0));
    studentList.add(new Student("Boris", "1B", 3.1));
    studentList.add(new Student("Timur", "1B", 2.5));
    studentList.add(new Student("Sophy", "2A", 4.4));
    studentList.add(new Student("Oksana", "2A", 3.4));
    studentList.add(new Student("Evgeniy", "2B", 3.9));
    studentList.add(new Student("Alena", "2B", 4.1));
    studentList.add(new Student("Luda", "2B", 4.8));
    studentList.add(new Student("Denis", "2B", 2.2));
    studentList.add(new Student("Maksim", "3A", 4.0));
    studentList.add(new Student("Karina", "3A", 4.6));
    studentList.add(new Student("Tamara", "3A", 3.9));
    studentList.add(new Student("Stepan", "3A", 4.5));
    studentList.add(new Student("Ivan", "3B", 3.3));
    studentList.add(new Student("Nadya", "3B", 4.1));

    System.out.println(studentList);
    removeStudentWhenAverageScoreLessThen3(studentList);
    System.out.println(studentList);

    System.out.println(sortStudentsByName(studentList));
    System.out.println(sortStudentsByGroup(studentList));
    System.out.println(sortStudentsByAverageScore(studentList));
    System.out.println(sortStudentsByGroupWhenByAverageScore(studentList));

  }

  public static void removeStudentWhenAverageScoreLessThen3(List<Student> studentList) {
    Iterator<Student> iterator = studentList.iterator();

    while (iterator.hasNext()) {
      if (iterator.next().getAverageScore() < 3) {
        iterator.remove();
      }
    }
  }

  public static List<Student> sortStudentsByName(List<Student> studentList) {
    studentList.sort(new StudentNameComparator());

    return studentList;
  }

  public static List<Student> sortStudentsByGroup(List<Student> studentList) {
    studentList.sort(new StudentGroupComparator());

    return studentList;
  }

  public static List<Student> sortStudentsByAverageScore(List<Student> studentList) {
    studentList.sort(new StudentAverageScoreComparator());

    return studentList;
  }

  public static List<Student> sortStudentsByGroupWhenByAverageScore(List<Student> studentList) {
    studentList.sort(
        new StudentGroupComparator().thenComparing(new StudentAverageScoreComparator()));

    return studentList;
  }
}
