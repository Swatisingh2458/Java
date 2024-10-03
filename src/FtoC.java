import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value of F");
        float F = Scanner.nextFloat();
        float C = (F-32)*5/9;
        System.out.println(C);
    }
}
