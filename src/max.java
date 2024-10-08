package Method;

import java.util.Scanner;

public class max {
    static void Max(int n,int arr[],int max) {
        for(int i=0; i<n; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }


            System.out.println(max);
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
            Max(n,arr, max);
        }
    }

}
