import java.util.Scanner;

public class AddTwoNum {
    public static void main(String [] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = Scanner.nextInt();
        System.out.println("Enter the value of B");
        int b = Scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }
}
