import java.util.Scanner;

public class stringsBasics{
  public static void main(String[] args) {
    // create String
    String str = "abcd";
    String str2 = new String("xyz");

    // input String
    Scanner sc = new Scanner(System.in);
    String newStr = sc.next();
    System.out.println(newStr);
  }
}