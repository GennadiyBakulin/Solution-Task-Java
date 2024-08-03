package modul4.SortedCollections.Task1;

public class Student {

  private String name;
  private String groupName;
  private Double averageScore;

  public Student(String name, String groupName, Double averageScore) {
    this.name = name;
    this.groupName = groupName;
    this.averageScore = averageScore;
  }

  public String getName() {
    return name;
  }

  public String getGroupName() {
    return groupName;
  }

  public Double getAverageScore() {
    return averageScore;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", groupName='" + groupName + '\'' +
        ", averageScore=" + averageScore +
        '}';
  }
}
