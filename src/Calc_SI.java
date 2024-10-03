import java.util.Scanner;

public class Calc_SI {
    public static void main(String [] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value of Principle, Rate, and Time");
        double P = Scanner.nextDouble();
        double R = Scanner.nextDouble();
        double T = Scanner.nextDouble();
        double SI = (P*R*T)/100;
        System.out.println(SI);
    }
}
