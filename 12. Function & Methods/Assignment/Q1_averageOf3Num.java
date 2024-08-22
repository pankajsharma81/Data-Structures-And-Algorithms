public class Q1_averageOf3Num {

  public static void average(int a, int b, int c) {
    int avg = (a + b + c) / 3;
    System.out.println("The average of three numbers is: " + avg);
  }

  public static void main(String[] args) {
    average(3, 3, 3);
  }
}