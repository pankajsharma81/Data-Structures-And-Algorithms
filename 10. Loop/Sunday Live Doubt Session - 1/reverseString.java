public class reverseString {
  public static void main(String[] args) {
    String str = "abcde";
    int n = str.length();
    String newStr = "";

    for (int i = 0; i < n; i++) {
      newStr = str.charAt(i) + newStr;
    }
    System.out.println(newStr);
  }
}