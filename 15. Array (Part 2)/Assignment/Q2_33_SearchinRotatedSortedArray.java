public class Q2_33_SearchinRotatedSortedArray {

  public static int SearchinRotatedSortedArray(int arr[], int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[low] <= arr[mid]) {
        if (arr[low] <= target && target < arr[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else if (arr[mid] <= arr[high]) {
        if (arr[mid] < target && target <= arr[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 0;
    int result = SearchinRotatedSortedArray(arr, target);
    System.out.println(result);

  }
}