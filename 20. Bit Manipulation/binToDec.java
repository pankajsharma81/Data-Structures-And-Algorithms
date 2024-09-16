public class binToDec{
  public static void main(String[] args) {
    int bin = 1010;
    int dec = 0;
    int pow = 0;

    while(bin >0){
      int ls = bin % 10;
      dec = dec + (ls * (int)Math.pow(2, pow));
      pow++;
      bin = bin / 10;
    }
    System.out.println(dec);
  }
}