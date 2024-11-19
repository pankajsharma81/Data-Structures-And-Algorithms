import java.util.ArrayList;

public class CMW_Otimized {

  public static int storeWater(ArrayList<Integer> height) {
    int maxWater = 0;
    int lp = 0;
    int rp = height.size() - 1;

    while (lp < rp) {
      // calculate water area
      int minH = Math.min(height.get(lp), height.get(rp));
      int wid = rp - lp;
      int water = minH * wid;
      maxWater = Math.max(water,maxWater);

      // update pointers
      if (height.get(lp) < height.get(rp)) {
        lp++;
      } else {
        rp--;
      }
    }
    return maxWater;

  }

  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

    System.out.println(storeWater(height));
  }
}
