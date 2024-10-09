import java.util.Scanner;

public class sumOfAllOddNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int N = input.nextInt();
        double sum = Math.pow((double) (N + 1) /2,2);
        System.out.println(sum);
    }
}
