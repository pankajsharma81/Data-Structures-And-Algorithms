public class sunOfN {

  public static int sum(int n) {
    if (n == 1) {
      return 1;
    }
    int fnm1 = sum(n - 1);
    int fn = n + fnm1;
    return fn;
  }

  public static void main(String[] args) {
    System.out.println(sum(10));
  }
}
