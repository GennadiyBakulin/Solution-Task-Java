package modul1;

public class Task3 {

  static String time(long sec) {
    long second = sec % 60;
    long minuteTotal = (sec - second) / 60;
    long minute = minuteTotal % 60;
    long hourTotal = (minuteTotal - minute) / 60;
    long hour = hourTotal % 24;
    long dayTotal = (hourTotal - hour) / 24;
    long day = dayTotal % 7;
    long week = (dayTotal - day) / 7;

    return "Weeks: " + week + "\nDays: " + day + "\nHours: " + hour + "\nMinutes: " + minute
        + "\nSeconds: " + second;
  }

  public static void main(String[] args) {
    System.out.println(time(1689651255L));
  }

}
