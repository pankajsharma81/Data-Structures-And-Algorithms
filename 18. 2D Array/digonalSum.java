public class digonalSum {

  public static int diagonalSum(int arr[][]) {

    // o(n2)
    // int Sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[0].length; j++) {
    // if (i == j) {
    // Sum += arr[i][j];
    // } else if (i + j == arr.length - 1) {
    // Sum += arr[i][j];
    // }
    // }
    // }

    // o(n)
    int Sum = 0;
    for (int i = 0; i < arr.length; i++) {
      // pd
      Sum += arr[i][i];

      // sd
      if (i != arr.length - i - 1)
        Sum += arr[i][arr.length - i - 1];

    }
    return Sum;
  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    System.out.print(diagonalSum(arr) + " ");
  }
}
