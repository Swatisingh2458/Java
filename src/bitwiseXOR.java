import java.util.Scanner;

public class bitwiseXOR {
    public static void main (String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();
        int sum = a ^ b;
        System.out.println(sum);

    }
}
