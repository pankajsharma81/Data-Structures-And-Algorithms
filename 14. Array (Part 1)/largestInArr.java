public class largestInArr{
  public static int largestInArr(int arr[]){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
  public static void main(String[] args) {
    int arr[]= {4,6,34,65,2,99,45};
    System.out.println(largestInArr(arr));
  }
}