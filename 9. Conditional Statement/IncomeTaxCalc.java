public class IncomeTaxCalc {
  public static void main(String[] args) {
    int income = 600000;
    int tax = 0;
    if (income <= 500000) {
      System.out.println("tax is: " + tax);
    } else if (income > 500000 && income <= 1000000) {
      tax = (int) ((income - 500000) * 0.2);
      System.out.println("tax is: " + tax);
    } else {
      tax = (int) ((income - 1000000) * 0.3);
      System.out.println("tax is: " + tax);
    }
  }
}
