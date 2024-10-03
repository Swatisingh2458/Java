import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value of A,B and C");
        int A = Scanner.nextInt();
        int B = Scanner.nextInt();
        int C = Scanner.nextInt();
        if(A>B && A>C){
            System.out.println(A);
        }
        else if (B>C && B>A){
            System.out.println(B);
        }
        else
            System.out.println(C);
    }
}
