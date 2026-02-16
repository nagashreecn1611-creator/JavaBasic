import java.util.Scanner;

public class averageArr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements : ");
    int n = sc.nextInt();

    int arr [] = new int[n];
    double sum = 0;
    double Average =0;

    System.out.println("Enter " +n+ " elements");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      sum = sum+arr[i];
    }
    Average = sum / n;

    System.out.print("Average of the array : "+Average);
    sc.close();
  }
}