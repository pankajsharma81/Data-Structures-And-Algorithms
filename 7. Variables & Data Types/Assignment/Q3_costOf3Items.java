import java.util.Scanner;

public class Q3_costOf3Items {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the cost of pencil: ");
    float pencil = sc.nextFloat();
    System.out.println("Enter the Cost of Pen: ");
    float pen = sc.nextFloat();
    System.out.println("Enter the cost of Eraser: ");
    float eraser = sc.nextFloat();

    float bill = pencil + pen + eraser;

    float tax = bill * 0.18f;
    System.out.println("tax: " + tax);
    
    float total = bill + tax;
    System.out.println("The total bill is: " + total);
  }
}