import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Digit: ");
        int N = input.nextInt();
        int ON = N;
        int Rem = 0;
        int result = 0;
        while (N!= 0) {
            Rem = N % 10;
            result += Math.pow(Rem, 3);
            N /= 10;
        }
            if (ON == result) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not Armstrong Number ");
            }
        }

    }