import java.util.Scanner;

public class palinStr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the String Name : ");
    String s = sc.nextLine();

    String reverse = "";

    for(int i=s.length()-1;i>=0;i--){
      reverse= reverse + s.charAt(i);
    }
    
    if(s.equals(reverse)){
      System.out.println("the string is palindrome");
    } else{
      System.out.println("Not a plaindrome");
    }
    sc.close();
  }
}
