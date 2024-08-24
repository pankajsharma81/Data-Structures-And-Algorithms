public class hollowRectangle {

  public static void hollowRectangle(int row,int col) {
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= col; j++) {
        if (i == 1 || i == row || j == 1 || j == col) {
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }

  public static void main(String[] args) {
    int n = 5;
    hollowRectangle(4,5);
  }
}