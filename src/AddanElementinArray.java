import java.util.Scanner;

public class AddanElementinArray {


    static void Add(int arr[], int n, int s) {
        for (int i = arr.length - 2; i >= 2; i--) {
            arr[i+1]=arr[i];


        }

        arr[2] = s;
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        // Fill the array with user input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = 60;
        Add(arr, n, s);
    }
}
