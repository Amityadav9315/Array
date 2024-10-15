import java.util.Scanner;

public class DeleteanElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        int temp = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 2; i < n-1; i++) {
            arr[i] = arr[i + 1];
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
