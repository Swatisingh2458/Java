import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number which we will have to find the LCM :");
        int A = input.nextInt();
        int B = input.nextInt();
        int lcmOfNums = lcmOfNums( A, B);
        System.out.println(lcmOfNums);
    }
    public static int lcmOfNums(int A, int B){
        for(int i=1; i<=B; i++){
            int factor = A*i;
            if(factor % B == 0){
                return factor;
            }
        }
        return 0;
    }
}
