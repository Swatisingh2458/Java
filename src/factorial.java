import java.util.Scanner;

import static javax.swing.text.html.HTML.Attribute.N;

public class factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N = input.nextInt();
        long fact = factorialOfNum(N);
        System.out.println(fact);



    }
    public static long factorialOfNum(int N){
     if(N<2){
         return 1;
     }
     long fact = 1;
     for(int i=2; i<=N; i++)
     {
         fact = fact*i;
     }

        return fact;
    }
}
