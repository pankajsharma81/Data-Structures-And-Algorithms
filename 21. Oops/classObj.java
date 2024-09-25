public class classObj{
  public static void main(String[] args) {
    Pen p = new Pen();
    p.color = "red";
    System.out.println(p.color);
    p.tip = 5;
    System.out.println(p.tip);
  }
}

class Pen{
  String color;
  int tip;

  void setColor(String newColor){
    color = newColor;
  }

  void setTip(int newTip){
    tip = newTip;
  }
}