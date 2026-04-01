
import java.util.Arrays;

class Student implements Comparable<Student> {
  int rno;
  double perc;
  String name;

  Student(int rno, int perc, String name) {
    this.rno = rno;
    this.perc = perc;
    this.name = name;

  }

  public int compareTo(Student s) {
    return (int) (this.perc - s.perc);
  }
}

public class _04_CustomComparator {
  public static void print(Student[] s) {
    for (int i = 0; i < s.length; i++) {
      System.out.print(s[i].rno + " ");
      System.out.print(s[i].perc + " ");
      System.out.print(s[i].name + " ");
      System.out.println();
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Student[] students = new Student[4];
    students[0] = new Student(1, 89, "Raushan");
    students[1] = new Student(2, 93, "Raj");
    students[2] = new Student(3, 56, "ayush");
    students[3] = new Student(4, 78, "rohan");
    print(students);
    Arrays.sort(students);

    print(students);
  }
}
