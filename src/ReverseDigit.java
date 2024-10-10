import java.util.Scanner;

public class ReverseDigit {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long N = input.nextLong();
        long reverse = reverse(N);
        System.out.println(reverse);

    }
   public static long reverse(long N){
        int N_Num =0;
       while (N>0){
            int rem = (int) (N % 10);
            N = N / 10;
            N_Num = N_Num*10 + rem;

       }
        return N_Num;
   }

}
