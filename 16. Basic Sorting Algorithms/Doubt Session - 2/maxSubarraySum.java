public class maxSubarraySum {
  public static int maxSubArray(int[] nums) {
    int maxSum = Integer.MIN_VALUE;
    int currsum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        currsum = 0;
        for (int k = i; k <= j; k++) {
          currsum += nums[k];
        }
        maxSum = Math.max(maxSum, currsum);
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(maxSubArray(arr));
  }
}