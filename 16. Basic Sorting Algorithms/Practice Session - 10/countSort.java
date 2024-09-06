public class countSort {
  public static void countSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }

    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }
    // inc...........
    // int k = 0;
    // for (int i = 0; i < count.length; i++) {
    // while (count[i] > 0) {
    // arr[k] = i;
    // k++;
    // count[i]--;
    // }
    // }

    // dec...........
    int k = 0;
    for(int i = largest ; i>=0; i--){
      while(count[i] > 0){
        arr[k] = i;
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
    int arr[] = { 4, 2, 2, 8, 3, 8 };
    countSort(arr);
    printArr(arr);
  }
}