import java.util.Scanner;

public class bitwiseNot {
    public static void main (String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Enter number");
    int a = Scanner.nextInt();

    int Comp = ~ a;
    System.out.println(Comp);

}
}
