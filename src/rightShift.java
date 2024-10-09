import java.util.Scanner;

public class rightShift {
    public static void main (String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = Scanner.nextInt();

        int l_shift = a >>1 ;
        System.out.println(l_shift);

    }
}
