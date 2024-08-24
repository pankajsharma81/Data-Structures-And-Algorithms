public class solidRhombus {
  public static void solidRhombus(int n) {
    for (int i = 1; i <= n; i++) {
      for (int sp = 1; sp <= n - i; sp++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    solidRhombus(5);
  }
}
