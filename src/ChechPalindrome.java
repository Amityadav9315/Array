import java.util.Scanner;

public class ChechPalindrome {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0,count1=0;
    int[] arr=new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0; i<n; i++){
        if(arr[i]==arr[n-1-i]){
            count++;
        }
        else{
            count1++;
        }
    }
    if(count1>1){
        System.out.println("Not Palindrome");
    }
    else{
        System.out.println("Palindrome");
    }

}
}
