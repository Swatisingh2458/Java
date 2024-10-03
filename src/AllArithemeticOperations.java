import java.util.Scanner;

public class AllArithemeticOperations {
    public static void main(String [] args)
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        int x = Scanner.nextInt();
        int y = Scanner.nextInt();
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
    }
}
