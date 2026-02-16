import java.util.Scanner;
public class evenodd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements : ");
    int n = sc.nextInt();
    int arr[]= new int[n];

    int evencount = 0;
    int oddcount = 0;

    System.out.println("Enter" +n+ "Elements");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    for(int i=0;i<n;i++){
      if(arr[i]%2==0){
        evencount++;
      }
    }
    
    for(int i=0;i<n;i++){
      if(arr[i]%2!=0){
        oddcount++;
      }
    }
    System.out.println("Count of even Numbers :"+evencount);
    System.out.println("count of odd Numbers : "+oddcount);
    sc.close();
  }
}
