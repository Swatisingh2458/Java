import java.util.Scanner;

public class Num_Of_Occurances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = input.nextInt();
        System.out.println("Enter the element");
        int [] Arr = new int[size];
        int count =0;
        int num = 6;
        for(int i=0; i<size; i++){
            Arr[i] = input.nextInt();
        }
        for(int i=0; i<size; i++){
            System.out.print(Arr[i] + " ");
        }
        for(int i=0; i<size; i++){
           if(Arr[i] == num ){
               count++;

           }
        }
        System.out.println(" ");
        System.out.println(count);


    }
}
