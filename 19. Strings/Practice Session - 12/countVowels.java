import java.util.Scanner;

public class countVowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();

    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'u'
          || str.charAt(i) == 'o') {
        count++;
      }
    }
    System.out.println("Number of vowels in the string: " + count);
  }
}