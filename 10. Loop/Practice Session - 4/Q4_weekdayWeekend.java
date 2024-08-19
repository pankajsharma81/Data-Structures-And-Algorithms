public class Q4_weekdayWeekend {
  public static void main(String[] args) {

    int day = 7;

    switch (day) {
      case 1, 2, 3, 4, 5:
        System.out.println("weekday");
        break;
      case 6, 7:
        System.out.println("weekend");
        break;

      default:
        System.out.println("Invalid day");
        break;
    }
  }
}
