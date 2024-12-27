import java.util.Scanner;

public class perfectSquare {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

            int count=0;
            for(int i=1; i<num/2; i++){
                if(i*i==num){
                    count++;
                }
            }
            if(count>=1){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }

        }
    }

