import java.util.Scanner;

public class Multipication {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int N = Scanner.nextInt();
        int r=1;
        System.out.println("Enter the Number:");
        for(int i =1; i<=10; i++)
        {
            r=N*i;
            System.out.println(N + " x " + i + " = " + r);

        }
    }
}
