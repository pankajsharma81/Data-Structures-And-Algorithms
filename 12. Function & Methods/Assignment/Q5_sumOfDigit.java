public class Q5_sumOfDigit {

  public static void sumOfDigit(int n){
    int sum = 0;
    while(n > 0){
      int ls = n%10;
      sum = sum + ls;
      n = n/10;
    }
    System.out.println(sum);
  }
  public static void main(String[] args) {
    sumOfDigit(123456789);
  }
}
