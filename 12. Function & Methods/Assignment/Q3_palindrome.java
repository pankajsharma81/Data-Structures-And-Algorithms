public class Q3_palindrome {

  public static void palindrome(int n) {
    int ori = n;
    int rev = 0;
    while (n > 0) {
      int rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
    }
    if (ori == rev) {
      System.out.println("The number is a palindrome");
    } else {
      System.out.println("The number is not a palindrome");
    }
  }

  public static void main(String[] args) {
    palindrome(12321);
  }
}
