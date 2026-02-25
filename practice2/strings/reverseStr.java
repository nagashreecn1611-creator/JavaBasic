import java.util.Scanner;

public class reverseStr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the String Name :");
    String s = sc.next();

    String reverse = " ";

    for(int i=s.length()-1;i>=0;i--){
      reverse= reverse + s.charAt(i);
    }
    System.out.println("Reversed String: " +reverse);

    sc.close();
  }
}
