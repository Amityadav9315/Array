import java.util.Scanner;

public class CountfFrequencyofeachElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0; i<n-1; i++){
            for(int j=1; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            System.out.println(arr[i]+" "+count);
            count=0;

        }
    }
}
