import java.util.Scanner;

public class Q1_averageOf3Num{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int avg = (a+b+c)/3;
    System.out.println("The average of three numbers is: "+avg);
    
  }
}