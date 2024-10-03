import java.util.Scanner;

public class CheckP_N_Z {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value which you want to check :");
        int n = Scanner.nextInt();
        if(n>0){
            System.out.println("Positive Number");
        }
        else if(n<0){
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }
    }
}
