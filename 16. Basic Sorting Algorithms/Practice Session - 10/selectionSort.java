public class selectionSort {

  public static void selectionSort(int arr[]){

    for(int i = 0; i<arr.length-1;i++){
      int pos = i;
      for(int j = i+1;j<arr.length;j++){
        if(arr[pos]>arr[j]){
          pos = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[pos];
      arr[pos] = temp;
    }
  }

  
  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    int  arr[] = {64, 34, 25, 12, 22, 11};
    selectionSort(arr);
    printArr(arr);
  }
}
