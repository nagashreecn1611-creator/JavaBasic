package classObject;
import java.util.Scanner;

class cirlce{
  double radius;

    void calArea(){
      double Area = 3.14 * radius * radius;
      System.out.println("The Area of the circle is : "+ Area);
    }
    void calCircumference(){
      double Circumference = 2 * 3.14 * radius;
      System.out.println("The Circumference of the circle is : "+Circumference);
    }

}



public class circleArea {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    cirlce c = new cirlce();

    System.out.print("Enter the radius of the circle : ");
    c.radius = sc.nextDouble();

    c.calArea();
    c.calCircumference();
  }
}
