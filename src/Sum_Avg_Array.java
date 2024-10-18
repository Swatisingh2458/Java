import java.util.Scanner;

public class Sum_Avg_Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Size of Array:");
        int size = input.nextInt();
        int sum=0;
        float Avg=0;
        System.out.println("Enter your element");
        int [] Arr = new int[size];

        for(int i =0; i<size; i++){
            Arr[i] = input.nextInt();
        }
        for(int i =0; i<size; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println(" ");
        for(int i =0; i<size; i++) {
            sum = sum + Arr[i];
        }
        for(int i =0; i<size; i++) {
            Avg = (float) sum/size;
        }
        System.out.println(sum);
        System.out.println(Avg);


    }
}
