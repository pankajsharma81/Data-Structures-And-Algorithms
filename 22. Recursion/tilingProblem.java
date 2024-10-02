public class tilingProblem {

  public static int tilingProblem(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }

    // vertical choice
    int vertical = tilingProblem(n - 1);

    // Horizontal choice
    int horizontal = tilingProblem(n - 2);

    return vertical + horizontal;
  }

  public static void main(String[] args) {
    System.out.println(tilingProblem(4));
  }
}
