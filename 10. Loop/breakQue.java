import java.util.Scanner;

public class breakQue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int n = sc.nextInt();

    while (true) {
      if (n % 10 == 0) {
        break;
      }
      System.out.println("Enter Again");
      n = sc.nextInt();
    }
  }
}
