import java.util.Scanner;

public class Fibonacci_series {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        fibonacci(num);

    }
    public static void fibonacci(int num){
        if(num<0) return;
        System.out.print("0 ");
        if (num==0) return;
        System.out.print("1 ");
        int f =0;
        int s =1;
        while(f + s <= num){
           int t = f + s;
            System.out.print(t + " ");
            f = s;
            s = t;
        }


    }

}
