public class increasingOrder {

  public static void printInc(int n){
    if(n == 1){
      System.out.println(n);
      return;
    }

    printInc(n-1);
    System.out.println(n);
  }
  public static void main(String[] args) {
    printInc(5);
  }
}
