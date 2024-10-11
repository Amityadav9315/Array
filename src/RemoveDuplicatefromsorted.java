import java.util.Scanner;

public class RemoveDuplicatefromsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] arr = new int[n];
        int[] arr2 = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] != arr[j]) {
                    //  int[] arr2;
                    arr2[i] = arr[i];
                }
            }
        }
        for (int x:arr2) {
            System.out.println(x);
        }
    }
}
