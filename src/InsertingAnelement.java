import java.util.Scanner;

public class InsertingAnelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numberg");
        int k=100;
        int[] arr=new int[10];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;
        arr[6]=70;
        for(int i=6; i>=2; i--){
            arr[i+1]=arr[i];

        }
        arr[2]=k;
        for(int x:arr){
            System.out.print(x+" ");
        }



        }
}
