import java.util.Scanner;

public class Calc_AreaOfTriangle {
    public static void main (String [] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value of Height and Base");
        Double H = Scanner.nextDouble();
        Double B = Scanner.nextDouble();
        Double Area = 0.5*(B*H);
        System.out.println(Area);
    }
}
