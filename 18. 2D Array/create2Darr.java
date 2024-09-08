import java.util.Scanner;

public class create2Darr {

  public static boolean search(int arr[][], int key) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] == key) {
          System.out.println("key found: " + "(" + i + "," + j + ")");
          return true;
        }
      }
    }
    System.out.println("Not found");
    return false;
  }

  public static void main(String[] args) {
    // create Array
    int[][] arr = new int[3][3];

    // take input
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    // print output
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println(search(arr, 5));

  }
}