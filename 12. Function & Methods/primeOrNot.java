public class primeOrNot {

  public static boolean prime(int n) {
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

  public static void main(String[] args) {

    if (prime(12) == true) {
      System.out.println("Prime");
    } else {
      System.out.println("Not Prime");
    }
  }
}
