public class fibonacci {
  public static int fibo(int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    int fn = fibo(n - 1) + fibo(n - 2);
    return fn;

  }

  public static void main(String[] args) {
    System.out.println(fibo(6));
    System.out.println(fibo(7));
  }
}
