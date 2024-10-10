public class sortedRotated {

  public static int search(int arr[], int target, int st, int en) {
    if (st > en) {
      return -1;
    }

    int mid = st + (en - st) / 2;

    if (arr[mid] == target) {
      return mid;
    }

    if (arr[st] <= arr[mid]) {
      if (arr[st] <= target && target <= arr[mid]) {
        return search(arr, target, st, mid - 1);
      } else {
        return search(arr, target, mid + 1, en);
      }
    } else {
      if (arr[mid] <= target && target <= arr[en]) {
        return search(arr, target, mid + 1, en);
      } else {
        return search(arr, target, st, mid - 1);
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 6;
    System.out.println(search(arr, target, 0, arr.length - 1));
  }
}