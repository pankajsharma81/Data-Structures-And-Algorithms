public class fact {

  public static int fact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static int nCr(int n,int r){
    int nFact = fact(n);
    int rFact = fact(r);
    int n_rFact = fact(n-r);

    int nCr = nFact/(rFact * n_rFact);
    return nCr;

  }

  public static void main(String[] args) {
    System.out.println(nCr(5, 2));
  }
}
