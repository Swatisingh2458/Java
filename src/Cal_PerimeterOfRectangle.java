import java.util.Scanner;

public class Cal_PerimeterOfRectangle {
    public static void main (String [] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value of A, B, C, D");
        int A = Scanner.nextInt();
        int B = Scanner.nextInt();
        int C = Scanner.nextInt();
        int D = Scanner.nextInt();
        int P_R = A + B + C + D;
        System.out.println(P_R);
    }
}
