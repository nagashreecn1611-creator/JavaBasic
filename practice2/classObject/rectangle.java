package classObject;
import java.util.Scanner;

class Area{
  double width;
  double length;

  void display(){
    double Area = width * length;
    System.out.println("Total Area : " +Area);
  }
}

public class rectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Area a = new Area();

    System.out.println("Enter the width: ");
    a.width = sc.nextDouble();

    System.out.println("Enter the length: ");
    a.length = sc.nextDouble();

    a.display();
    sc.close();
  }
}
