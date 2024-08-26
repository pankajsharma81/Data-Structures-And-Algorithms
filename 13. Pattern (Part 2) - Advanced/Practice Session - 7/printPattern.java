public class printPattern{

  public static void printPattern(int n){
    int total_lines = n;
    int space = n-1;
    int stars = 1;
    int current_line = 1;

    while(current_line<=total_lines){
      // print spaces
      for(int i=1;i<=space;i++){
        System.out.print(" ");
      }
      // print stars
      for(int i=1;i<=stars;i++){
        System.out.print("*");
      }
      // for next line
      System.out.println("");
      space--;
      stars++;
      current_line++;
    }
  }
  public static void main(String[] args) {
    printPattern(5);
  }
}