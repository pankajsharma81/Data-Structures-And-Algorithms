public class permutation {

  public static void findPermutation(String str, String ans) {
    // base case
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }

    // recursion
    for (int i = 0; i < str.length(); i++) {
      char curr = str.charAt(i);
      String remaining = str.substring(0, i) + str.substring(i + 1);
      findPermutation(remaining, ans + curr);
    }
  }

  public static void main(String[] args) {
    findPermutation("abc", "");
  }
}
