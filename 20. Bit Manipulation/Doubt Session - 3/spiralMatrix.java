public class spiralMatrix {
  public static void spiralMatrix(int arr[][]) {
    int sRow = 0;
    int eRow = arr.length - 1;
    int sCol = 0;
    int eCol = arr[0].length - 1;

    while (sRow <= eRow && sCol <= eCol) {
      // top
      for (int j = sCol; j <= eCol; j++) {
        System.out.print(arr[sRow][j]+" ");
      }
      // right
      for (int i = sRow + 1; i <= eRow; i++) {
        System.out.print(arr[i][eCol]+" ");
      }
      // bottom
      for (int j = eCol - 1; j >= sCol; j--) {
        if(sRow == eRow){
          break;
        }
        System.out.print(arr[eRow][j]+" ");
      }
      // left
      for (int i = eRow - 1; i >= sRow + 1; i--) {
        if(sCol == eCol){
          break;
        }
        System.out.print(arr[i][sCol]+" ");
      }

      sRow++;
      eRow--;
      sCol++;
      eCol--;
    }
  }

  public static void main(String[] args) {

    int[][] arr = { { 0, 1, 2, 3 },
        { 11, 12, 13, 4 },
        { 10, 15, 14, 5 },
        { 9, 8, 7, 6 } };
        spiralMatrix(arr);
  }
}