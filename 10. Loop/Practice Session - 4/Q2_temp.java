import java.util.Scanner;

public class Q2_temp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter temp: ");
    Double n = sc.nextDouble();

    if (n >= 103.5) {
      System.out.println("fever");
    } else {
      System.out.println("not a fever");
    }
  }
}
