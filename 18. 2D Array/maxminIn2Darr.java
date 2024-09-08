import java.util.*;

public class maxminIn2Darr {

  public static void maxMin(int arr[][]) {
    int Max = Integer.MIN_VALUE;
    int Min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        Max = Math.max(Max, arr[i][j]);
        Min = Math.min(Min, arr[i][j]);
      }
    }
    System.out.println("Maximum element in the array is: " + Max);
    System.out.println("Minimum element in the array is: " + Min);
  }

  public static void main(String[] args) {
    // create Array
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // print output
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    maxMin(arr);

  }
}
