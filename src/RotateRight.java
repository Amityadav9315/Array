import java.util.Scanner;

public class RotateRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        temp=arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int x:arr){
            System.out.print(x+" ");

        }
    }
}
