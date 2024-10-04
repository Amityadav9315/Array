import java.util.*;
public class SumofElementofarray {
    public static void Total(int arr[],int n,int sum){
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);




    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();


        }
        Total(arr,n,sum);
    }
}
