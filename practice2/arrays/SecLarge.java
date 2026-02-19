import java.util.Scanner;

class SecLarge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < n; i++) {                               //1 2 3 4 5
                                                                    // 5 > 4 // 4 = 5 // 5 = 5 
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            else if (arr[i] > secondLargest && arr[i] != largest) {        
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Second Largest element = " + secondLargest);

        sc.close();
    }
}

