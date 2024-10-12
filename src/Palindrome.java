import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long N = input.nextLong();
        long ON = N;
        int N_Num =0;
        while (N>0){
            int rem = (int) (N % 10);
            N = N / 10;
            N_Num = N_Num*10 + rem;

        }
        if(ON == N_Num){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome Number");
        }

    }
}
