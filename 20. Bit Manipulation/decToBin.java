public class decToBin {
  public static void main(String[] args) {
    int dec = 7;
    int bin = 0;
    int pow = 0;

    while (dec > 0) {
      int rem = dec % 2;
      bin = bin + (rem * (int) Math.pow(10, pow));
      pow++;
      dec = dec / 2;
    }

    System.out.println(bin);
  }
}
