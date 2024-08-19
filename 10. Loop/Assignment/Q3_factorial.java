public class Q3_factorial {
  public static void main(String[] args) {
    int n = 5;
    int fact = 1;
    for(int i = 1;i<=n;i++){
      fact = fact * i;
    }
    System.out.println("Factorial of "+n+" is "+fact);
  }
}
