public class moveZeroes {
  public static void moveZeroes(int[] nums) {

    int nonZeroIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[nonZeroIndex] = nums[i];
        nonZeroIndex++;
        System.out.print(nums[i] + " ");
      }
    }

    for (int i = nonZeroIndex; i < nums.length; i++) {
      nums[i] = 0;
      System.out.print(nums[i] + " ");

    }
  }

  public static void main(String[] args) {
    int nums[] = { 0, 1, 0, 3, 12 };
    moveZeroes(nums);
  }
}
