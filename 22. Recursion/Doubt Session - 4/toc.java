public class toc {

  static int total = 3;

  public static void toh(char src, char dest, char aux, int n) {
    // base case
    if (n == 0)
      return;

    toh(src, aux, dest, n - 1); // 1st faith (choti discs source --> extra tower)

    System.out.println((total - n + 1) + " disc move from " + src + " tower to " + dest + " tower ");

    toh(aux, dest, src, n - 1); // 2nd faith(choti discs extra --> destination tower)
  }

  public static void main(String[] args) {
    toh('A', 'B', 'C', 3);
  }
}