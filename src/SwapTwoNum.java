import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String [] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int A = Scanner.nextInt();
        System.out.println("Enter the value of B");
        int B = Scanner.nextInt();
        System.out.println("A is:" + A + " B is:" + B);
        int C;
        C = A;
        A = B;
        B = C;
        System.out.println("A is:" + A + " B is:" + B);

    }
}
