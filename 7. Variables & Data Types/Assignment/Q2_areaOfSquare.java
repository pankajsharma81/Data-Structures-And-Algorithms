import java.util.Scanner;

public class Q2_areaOfSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of the square:");
    int x = sc.nextInt();

    int area = x * x;
    System.out.println("Area of square: " + area);
  }
}
