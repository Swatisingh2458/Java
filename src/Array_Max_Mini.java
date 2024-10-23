import java.util.Scanner;

public class Array_Max_Mini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] Arr = {3,5,8,9,1};
        int Min = Integer.MIN_VALUE;
        int Max = Integer.MAX_VALUE;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > Min) {
                  Min= Arr[i];
            } else {
                if (Arr[i] < Max) {
                    Max = Arr[i];
                }
            }

        }
        System.out.println(Min);
        System.out.println(Max);
    }
}
