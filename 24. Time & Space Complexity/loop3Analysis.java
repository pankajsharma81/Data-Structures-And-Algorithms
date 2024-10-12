public class loop3Analysis {
  public static void main(String[] args) {
    int n = 50;
    int k = 5;
    for (int i = 0; i < n; i = i + k) {
      for (int j = i + 1; j <= k; j++) {
        System.out.println(i + " " + j);
      }
    }
  }
}