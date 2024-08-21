public class primeInRange {

  public static boolean isPrime(int n) {
    // corner case
    if (n == 2) {
      return true;
    }
    // main case
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void primeInRange(int n) {
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i+" ");
      }
    }
  }

  public static void main(String[] args) {

    primeInRange(20);
  }
}
