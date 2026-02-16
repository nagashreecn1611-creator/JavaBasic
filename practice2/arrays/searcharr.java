import java.util.Scanner;
public class searcharr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements : ");
    int n = sc.nextInt();
    int arr[]= new int[n];

    //int evencount = 0;
    //int oddcount = 0;

    System.out.println("Enter " +n+ " Elements");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    System.out.println("Enter the search element : ");
    int key = sc.nextInt();

    boolean found = false;

    for(int i=0;i<n;i++){
      if(key==arr[i]){
        System.out.println("Element Found at the index : "+i);
        found = true;
      }
    }
    if(!found){
        System.out.println("element not found! ");
    }
  }
}