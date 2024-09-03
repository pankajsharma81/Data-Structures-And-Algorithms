public class kadane {

  public static void kadane(int arr[]) {
    int currSum = arr[0];
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      // currSum
      // currSum = currSum + arr[i];
      // if (currSum < 0) {
      //   currSum = 0;
      // }
      currSum = Math.max(arr[i],currSum+arr[i]);
      // maxSum
      maxSum = Math.max(maxSum, currSum);
    }
    System.out.println(maxSum);

  }

  public static void main(String[] args) {
    int arr[] = { -1 };
    kadane(arr);
  }
}
