public class starPattern {

  public static void butterfly(int n){
    int total_lines = 2*n-1;
    int space = 2*n-2;
    int stars = 1;
    int current_line = 1;

    while(current_line<=total_lines){
      // print stars
      for(int i=1;i<=stars;i++){
        System.out.print("*");
      }
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
      if(current_line<n){
        space-=2;
        stars++;

      }else{
        space+=2;
        stars--;
      }
      current_line++;
    }
  }
  public static void main(String[] args) {
    butterfly(5);
  }
}
