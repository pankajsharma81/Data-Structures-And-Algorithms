public class Q2_isEven {
  public static boolean isEven(int n) {
    if (n % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    if(isEven(2)){
      System.out.println("The number is even");
    }else{
      System.out.println("The number is odd");
    }
  }
}