public class transposeMatrix {
  public static void transpose(int matrix[][]) {
    int rows = matrix.length;
    int columns = matrix[0].length;

    int transpose_array[][] = new int[columns][rows];
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        transpose_array[i][j] = matrix[j][i];
      }
    }
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.print(transpose_array[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int matrix[][] = { { 11, 12, 13 }, { 21, 22, 23 } };
    System.out.println("Original Matrix:");
    transpose(matrix);
  }
}
