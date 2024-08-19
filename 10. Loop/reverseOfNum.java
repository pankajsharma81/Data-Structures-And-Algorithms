public class reverseOfNum {
  public static void main(String[] args) {
    int num = 10899;
    int rev = 0;
    while(num>0){
      int rem = num%10;
      rev = rev*10 + rem;
      num = num/10;
    }
    System.out.println("Reverse of number is: "+rev);
  }
}
