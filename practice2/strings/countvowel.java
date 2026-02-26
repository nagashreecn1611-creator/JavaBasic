package strings;
import java.util.Scanner;

public class countvowel {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the STring Name");
    String s = sc.nextLine();

    s=s.toLowerCase();

    int vowels = 0;
    int consonent = 0;

    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        vowels++;
      }
      else{
        consonent++;
      }
    }
    System.out.println(vowels);
    System.out.println(consonent);
  }
}