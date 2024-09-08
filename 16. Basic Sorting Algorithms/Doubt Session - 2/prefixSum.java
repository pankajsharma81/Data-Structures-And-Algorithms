public class prefixSum {

  public static int prefixSum(int nums[]) {

    int maxSum = 0;
    int currSum = 0;

    int prefix[] = new int[nums.length];
    prefix[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      prefix[i] = prefix[i - 1] + nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
      }
      maxSum = Math.max(maxSum, currSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(prefixSum(arr));
  }
}
