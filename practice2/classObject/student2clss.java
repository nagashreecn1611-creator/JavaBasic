package classObject;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

class student {
  String Name;
  int Roll_no;
  Double Marks;

  void display(){
    System.out.println("-----Student Details------");
    System.out.println("Student Name : " +Name);
    System.out.println("Student RollNo : "+Roll_no);
    System.out.println("Student Marks : "+Marks);
  }
}



public class student2clss {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    student s1 = new student();

    System.out.println("Enter the Name : ");
    s1.Name = sc.nextLine();

    System.out.println("Enter the RollNo : ");
    s1.Roll_no = sc.nextInt();

    System.out.println("Enter the Marks : ");
    s1.Marks = sc.nextDouble();

    s1.display();
    sc.close();
  }
  
}
