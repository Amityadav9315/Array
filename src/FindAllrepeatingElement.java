import java.util.Scanner;

public class FindAllrepeatingElement {

    static void Repeat(int arr[], int n) {
        boolean[] isPrintedarr = new boolean[n];  // To track printed elements

        for (int i = 0; i < n - 1; i++) {
            int c = 0;  // Reset counter for each element

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    c++;  // Count occurrences of arr[i]
                }
            }

            if (c > 0 && !isPrintedarr[i]) {
                System.out.print(arr[i] + " ");
                // Mark duplicates so they won't be printed again
                for (int k = i; k < n; k++) {
                    if (arr[k] == arr[i]) {
                        isPrintedarr[k] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th number");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Repeat(arr, n);
    }
}
