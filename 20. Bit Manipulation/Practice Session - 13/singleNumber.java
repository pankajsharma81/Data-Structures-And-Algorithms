public class singleNumber{
  public static int singleNumber(int arr[]){
    int result = 0;
    for(int i = 0;i<arr.length;i++){
      result = result ^ arr[i];
    }
    return result;
  }
  public static void main(String[] args) {
    int[] nums = {2,2,1,1,3};
    System.out.println(singleNumber(nums));
  }
}