import java.util.ArrayList;

public class arrayList{
  public static void main(String[] args) {
    // Create an empty list
    ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<String> list1 = new ArrayList<>();
    // ArrayList<Boolean> list2 = new ArrayList<>();
    // ArrayList<Float> list3 = new ArrayList<>();

    // Add Element in arraylist ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.add(1,100); // O(n)
    System.out.println("ArrayList: " + list);
    
    // Get Element with index number ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    System.out.println(list.get(3));
    
    // remove Element with index number +++++++++++++++++++++++++++++++++++++++++++++++++++++
    System.out.println(list.remove(3));

    // set Element at Index ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    list.set(3,10);

    // contains Element +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    System.out.println(list.contains(10));
    System.out.println(list.contains(12));
    System.out.println("ArrayList: " + list);
  }
}