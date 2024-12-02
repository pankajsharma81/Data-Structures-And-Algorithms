public class LinkedList {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data) {
    // step1 create new node
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    // step2 newNode next = head
    newNode.next = head;

    // step 3 head = newNode
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
  }

  public void print() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "=>");
      temp = temp.next;
    }
    System.out.print("null");
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);

    ll.addLast(3);
    ll.addLast(4);
    ll.print();
  }
}