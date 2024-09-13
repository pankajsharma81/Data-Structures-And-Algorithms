public class shortestPath {

  public static float shortestPath(String str) {

    int y = 0;
    int x = 0;

    for (int i = 0; i < str.length(); i++) {
      char dir = str.charAt(i);
      // North
      if (dir == 'N') {
        y++;
      }

      // South
      else if (dir == 'S') {
        y--;
      }

      // East
      else if (dir == 'E') {
        x++;
      }

      // West
      else {
        x--;
      }
    }

    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(x2 + y2);

  }

  public static void main(String[] args) {
    String path = "WNEENESENNN";
    System.out.println(shortestPath(path));
  }
}
