public class xPowerN {

  // public static int xPowerN(int x, int n) {
  // if (n == 0) {
  // return 1;
  // }

  // return x * xPowerN(x, n - 1);
  // }

  // Optimized approach
  public static int xPowerN(int x, int n) {
    if (n == 0) {
      return 1;
    }

    // even
    int half = xPowerN(x, n / 2);
    int halfSq = half * half;

    // odd
    if (n % 2 != 0) {
      halfSq = halfSq * x;
    }

    return halfSq;
  }

  public static void main(String[] args) {
    System.out.println(xPowerN(2, 10));
  }
}
