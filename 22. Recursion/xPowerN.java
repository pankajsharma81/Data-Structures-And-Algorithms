public class xPowerN {

  // public static int xPowerN(int x, int n) {
  // if (n == 0) {
  // return 1;
  // }

  // return x * xPowerN(x, n - 1);
  // }

  public static int optimizedPower(int x, int n) {
    if (n == 0) {
      return 1;
    }

    int halfPower = optimizedPower(x, n / 2);
    int result = halfPower * halfPower;

    if (n % 2 != 0) {
      result *= x;
    }

    return result;
  }

  public static void main(String[] args) {
    // System.out.println(xPowerN(2, 10));
    System.out.println(optimizedPower(2, 10));
  }
}
