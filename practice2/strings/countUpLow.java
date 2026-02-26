import java.util.Scanner;

public class countUpLow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the String Name: ");
    String s = sc.next();

    int upperCase = 0;
    int lowerCase = 0;

    for(int i=0;i<s.length();i++){
      char ch =s.charAt(i);

      if(ch>='A' && ch<='Z'){
        upperCase++;
      }
      if(ch>='a' && ch<='z'){
        lowerCase++;
      }
    }
    System.out.println("UpperCase letters: "+ upperCase);
    System.out.println("LowerCase letters: "+ lowerCase);
  }
}
