public class numToLetter {
  // Declare the array as static and fix the keyword
  static String[] arr = { "Zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

  public static void printDigit(int num) {
    if (num == 0) {
      return;
    }

    int lastDigit = num % 10;
    printDigit(num / 10); // Recursive call
    System.out.print(arr[lastDigit] + " ");
  }

  public static void main(String[] args) {
    printDigit(1234);
  }
}
