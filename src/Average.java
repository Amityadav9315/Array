import java.util.Scanner;

public class Average {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            sum = (sum + arr[i] );
        }
        sum=sum/n;
        System.out.println(sum);

    }
}
