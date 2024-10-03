import java.util.Scanner;

public class Check_O_E {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter any number to check whether a number is odd or even: ");
        int n = Scanner.nextInt();
        if(n==0)
        {
            System.out.println("Zero");
        }
        else if (n%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
