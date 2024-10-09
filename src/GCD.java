import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number which we will have to find the GCD:");
        int A = input.nextInt();
        int B = input.nextInt();
        int gcdOfNums = gcdOfNums( A, B);
        System.out.println(gcdOfNums);
    }
    public static int gcdOfNums(int A, int B) {
        int gcd = 0;
        int least = least(A, B);
        for (int i = 2; i <= least; i++) {
            if (A % i == 0 && B % i == 0) {
                gcd = i;
            }

        }
        return gcd;

    }
    public static int least(int A, int B){
        if(A<B){
            return A;
        }
        else{
            return B;
        }
    }
}
