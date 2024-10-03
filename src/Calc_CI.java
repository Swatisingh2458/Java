import java.util.Scanner;

public class Calc_CI {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value of P, R, T ");
        double P = Scanner.nextDouble();
        double R = Scanner.nextDouble();
        double T = Scanner.nextDouble();
        double CI = P* Math.pow(1+(R/100),T) ;
        System.out.println(CI);
    }
}
