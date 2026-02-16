import java.util.Scanner;

public class reverseArr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int sum = 0;

    System.out.println("Enter " +n+ " numbers");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    
    System.out.println("Array After reversing : ");
    for(int i=n-1;i>=0;i--){
      System.out.print(arr[i] + " ");
    }
    sc.close();
  } 
}