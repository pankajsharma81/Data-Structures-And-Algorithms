public class palindromeStr {
  public static boolean palindrome(String str) {

    for (int i = 0; i < str.length() / 2; i++) {
      int n = str.length();
      if (str.charAt(i) != str.charAt(n - 1 - i)) {
        // Not a palindrome
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "madama";
    // System.out.println(palindrome(str));

    if (palindrome(str) == true) {
      System.out.println("palindrome");
    } else {
      System.out.println("not palindrome");
    }
  }
}
