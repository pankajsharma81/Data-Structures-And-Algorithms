public class copyCons {
  public static void main(String[] args) {

    Student s1 = new Student();
    s1.name = "pankaj";
    s1.roll = 123;
    s1.password = "abcd";

    s1.marks[0] = 100;
    s1.marks[1] = 200;
    s1.marks[2] = 300;

    // constructors class...
    Student s2 = new Student(s1);
    s2.password = "xyz";
    s1.marks[2] = 100;
    for (int i = 0; i < 3; i++) {
      System.out.println(s2.marks[i]);
    }
  }
}

class Student {
  String name;
  int roll;
  String password;
  int[] marks;

  Student(Student s1) {
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
  }

  Student() {
    marks = new int[3];
    System.out.println("constructor is called");
  }

  Student(String name) {
    this.name = name;
  }

  Student(int roll) {
    this.roll = roll;
  }
}