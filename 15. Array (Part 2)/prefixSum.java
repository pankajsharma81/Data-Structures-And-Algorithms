public class prefixSum {
  public static void prefixSum(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];

    // prefix array sum
    prefix[0] = arr[0];
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }

    for (int i = 0; i < arr.length; i++) {
      int start = i;
      for (int j = i; j < arr.length; j++) {
        int end = j;

        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

        if (currSum > maxSum) {
          maxSum = currSum;
        }
      }
    }

    System.out.println("max subarray sum: " + maxSum);

  }

  public static void main(String[] args) {
    int arr[] = {1,-2,6,-1,3};
    prefixSum(arr);
  }
}
