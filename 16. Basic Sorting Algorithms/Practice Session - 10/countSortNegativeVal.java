public class countSortNegativeVal {
  public static void countSortNegativeVal(int arr[]) {
    int mx = Integer.MIN_VALUE;
    int mn = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      mx = Math.max(mx, arr[i]);
      mn = Math.min(mn, arr[i]);
    }

    int count[] = new int[mx - mn + 1];
    for (int i = 0; i < arr.length; i++) {
      int ele = arr[i] - mn;
      count[ele]++;
    }

    int k = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[k] = i + mn;
        k++;
        count[i]--;
      }
    }
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 10, -1, -1, 6, 3, 5 };
    countSortNegativeVal(arr);
    printArr(arr);
  }
}
