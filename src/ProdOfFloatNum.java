import java.util.Scanner;

public class ProdOfFloatNum {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value of P & Q in Floating Numbers");
        float p = Scanner.nextFloat();
        float q = Scanner.nextFloat();
        float product = p*q;
        System.out.println(product);
    }
}
