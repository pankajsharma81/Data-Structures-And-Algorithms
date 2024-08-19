public class P2_bottonLeftTriangle {
  public static void main(String[] args) {
    int n = 5;
    // 1st way

    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // 2nd way

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i >= j) {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
