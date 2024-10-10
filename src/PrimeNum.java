import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int factor =0;
        int num = input.nextInt();
        boolean isprimenum = isprimenum(num);
        if (isprimenum) {
            System.out.println("Prime");
        }
       else {
            System.out.println("Not Prime");
        }




    }
    public static boolean isprimenum(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
return true;
    }

}
