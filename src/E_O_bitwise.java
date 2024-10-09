import java.util.Scanner;

public class E_O_bitwise {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = input.nextInt();

        int O_E = a;
        if((a&1) ==1){
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }

    }
}
