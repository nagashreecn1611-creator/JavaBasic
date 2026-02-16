package classObject;
import java.util.Scanner;

class student{
  String Name;
  int roll_no;
  int marks;

}

public class studentclss {
  public static void main(String[] args) {
    student s1 = new student();
    s1.Name="Suma";
    s1.marks=90;
    s1.roll_no=5;

    System.out.println(s1.Name +" : "+ s1.roll_no +" : "+ s1.marks);
  }
}