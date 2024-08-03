package modul4.SortedCollections.Task1;

import java.util.Comparator;

public class StudentGroupComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.getGroupName().compareTo(o2.getGroupName());
  }
}
