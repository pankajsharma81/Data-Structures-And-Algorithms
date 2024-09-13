public class subString {

  public static String subString(String str, int st, int en) {
    String sub = "";
    for (int i = st; i < en; i++) {
      sub += str.charAt(i);
    }
    return sub;
  }

  public static void main(String[] args) {
    String str = "HelloWorld";
    String subStr = str.substring(0, 5);
    System.out.println(subStr);
    System.out.println(subString(str,0,5));
  }
}
