public class clearLastIBits {

  public static int clearLastIBits(int n, int i) {
    int bitMask = ~(0) << i;
    return n & bitMask;
  }

  public static void main(String[] args) {
    int n = 15;
    int i = 2;
    System.out.println(clearLastIBits(n, i));
  }
}
