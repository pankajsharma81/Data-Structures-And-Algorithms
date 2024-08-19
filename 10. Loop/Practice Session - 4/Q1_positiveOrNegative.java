import java.util.Scanner;

public class Q1_positiveOrNegative {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();

    if (n >= 0) {
      System.out.println("number is positive");
    } else {
      System.out.println("number is negative");
    }

  }
}