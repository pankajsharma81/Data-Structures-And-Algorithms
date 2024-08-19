public class sumOfNnum {
  public static void main(String[] args) {
    int n = 10;

    int sum = 0;
    int i = 1;
    while (i <= n) {
      sum = sum + i;
      i++;
    }
    System.out.println("Sum of first " + n + " natural numbers is " + sum);
  }
}
