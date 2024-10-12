import java.util.Scanner;

public class FindAllrepeatingElement {

    static void Repeat(int arr[],int n,int c){
        for(int i=0; i<n-1; i++){
            for(int j=i; j<arr.length-1; j++) {
                if (arr[i] == arr[j + 1]) {
                    c++;
                }
            }
                if(c>0){
                    System.out.print(arr[i]+ " ");
                }

        }


    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int[] arr=new int[n];
        for(int i=0;  i<n; i++){
            arr[i]=sc.nextInt();

        }
        Repeat(arr,n,c);

    }

}
