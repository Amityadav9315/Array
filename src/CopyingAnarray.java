import java.util.Scanner;

public class CopyingAnarray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            b[i]=arr[i];
        }
        for(int x:b){
            System.out.print(x+" ");
        }
    }
}
