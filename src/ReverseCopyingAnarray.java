import java.util.Scanner;

public class ReverseCopyingAnarray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        int[] b=new int[n];
        for(int i=0; i<arr.length; i++){
            b[i]=arr[arr.length-i-1];
        }
        for(int x:b){
            System.out.print(x+" ");
        }
    }
}
