public class operationOnBit {
  public static int getIthBit(int n, int ith) {
    int bitMask = 1 << ith;
    if ((n & bitMask) == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  public static int setIthBit(int n, int ith) {
    int bitMask = 1 << ith;
    return n | bitMask;
  }

  public static int clearIthBit(int n, int ith) {
    int bitMask = ~(1 << ith);
    return n & bitMask;
  }

  public static int updateIthBit(int n, int ith, int newBit) {
    // 1st way
    // if(newBit == 0){
    // return clearIthBit(n,ith);
    // }else{
    // return setIthBit(n,ith);
    // }

    // 2nd way
    n = clearIthBit(n, ith);
    int bitMask = newBit << ith;
    return n | bitMask;

  }

  public static void main(String[] args) {
    int i = 10;
    System.out.println(getIthBit(i, 2));
    System.out.println(setIthBit(i, 2));
    System.out.println(clearIthBit(i, 1));
    System.out.println(updateIthBit(i, 2, 1));
  }
}
