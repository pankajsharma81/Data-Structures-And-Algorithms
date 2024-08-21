import java.util.*;

public class binToDec {

  public static int binToDec(int binNum){
    int decNum = 0;
    int pow = 0;
    while(binNum > 0){
      int ls = binNum %10;
      decNum += ls * Math.pow(2,pow);
      pow++;
      binNum = binNum / 10;
    }
    return decNum;
  }
  public static void main(String[] args) {
    System.out.println(binToDec(111));
  }
}
