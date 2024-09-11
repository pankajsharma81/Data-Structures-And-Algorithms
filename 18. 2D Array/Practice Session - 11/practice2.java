public class practice2 {
  public static int numberOfEle(int arr[][]) {
    // optimized Approach ......
    // int sum = 0;
    // for (int j = 0; j < arr[0].length; j++) {
    // sum += arr[1][j];
    // }
    // return sum;

    // 2nd Way.......
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (i == 1) {
          sum += arr[i][j];
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int[][] array = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
    System.out.println(numberOfEle(array));

  }
}