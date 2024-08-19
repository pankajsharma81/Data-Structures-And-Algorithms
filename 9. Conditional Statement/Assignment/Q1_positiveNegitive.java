import java.util.Scanner;

public class Q1_positiveNegitive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();

    if (num > 0) {
      System.out.println("The number is positive");
    } else {
      System.out.println("Number is negitive");
    }
  }
}