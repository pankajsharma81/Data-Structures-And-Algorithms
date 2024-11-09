public class leetcode88 {

  public static int[] mergeTwoSortedArray(int arr1[], int arr2[]) {
    int n = arr1.length;
    int m = arr2.length;

    int res[] = new int[n + m];

    int i = 0;
    int j = 0;
    int k = 0;
    while (i < n && j < m) {
      if (arr1[i] < arr2[j]) {
        res[k] = arr1[i];
        i++;
      } else {
        res[k] = arr2[j];
        j++;
      }
      k++;
    }

    while (i < n) {
      res[k] = arr1[i];
      i++;
      k++;
    }

    while (j < m) {
      res[k] = arr2[j];
      j++;
      k++;
    }

    return res;
  }

  public static void main(String[] args) {
    int arr1[] = {1,5,9,13,17};
    int arr2[] = {2,4,7,10,18,20};
    int res[] = mergeTwoSortedArray(arr1, arr2);
    
    for(int i = 0; i< res.length;i++){
      System.out.print(res[i]+" ");
    }
  }
}