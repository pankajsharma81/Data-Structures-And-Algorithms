public class searchInSortedMatrix {

  public static boolean searchInSortedMatrix(int arr[][], int target) {
    int row = 0;
    int col = arr[0].length - 1;

    while (row < arr.length && col >= 0) {
      if (arr[row][col] == target) {
        return true;
      } else if (target < arr[row][col]) {
        col--;
      } else {
        row++;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
    int target = 39;
    System.out.println(searchInSortedMatrix(arr, target));
  }
}
