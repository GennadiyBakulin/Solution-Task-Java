package Modul2;

public class Clock {
  int alarmHours;
  int alarmMinutes;

  public String setAlarm(int hours, int minutes) {

    if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60) {
      this.alarmHours = hours;
      this.alarmMinutes = minutes;
      return "Допустимое время";
    } else {
      return "Время не допустимо";
    }
  }

  public String checkAlarm(int hours, int minutes) {
    if (hours == alarmHours && minutes == alarmMinutes) {
      return "Chime";
    } else {
      return "";
    }
  }

  public int checkTimeCount(int hours, int minutes) {
    if (minutes == 0) {
      return hours % 12;
    } else if (minutes % 15 == 0) {
      return minutes / 15;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Clock clock = new Clock();
    System.out.println(clock.setAlarm(-10, 23));
    System.out.println(clock.checkAlarm(10, 20));
    System.out.println(clock.checkTimeCount(17, 00));
  }

}
