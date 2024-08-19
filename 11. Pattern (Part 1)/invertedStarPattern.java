public class invertedStarPattern {
  public static void main(String[] args) {
    int n = 4;
    // 1st way
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // 2nd way
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n-i+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
