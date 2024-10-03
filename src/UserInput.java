import java.util.Scanner;

public class UserInput {
    public static void main(String [] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = Scanner.nextLine( );
        System.out.println("Welcome " + name);
    }
}
