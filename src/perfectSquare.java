import java.util.Scanner;

public class perfectSquare {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

            int count=0;

                for (int i = 1; i <= num; i++) {
                    if (i * i == num) {
                        count++;
                        break;
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

