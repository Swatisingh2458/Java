import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Digit: ");
            int N = input.nextInt();
            int Sum = SumOfDigits(N);
            System.out.println(Sum);

        }

    public static int SumOfDigits(int N) {
        int Sum =0;
         while(N>0) {
             Sum += N % 10;
             N /= 10;
         }




            return Sum;
        }
    }

