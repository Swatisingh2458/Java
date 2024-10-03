import java.util.Scanner;

public class LeapOrNot {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the year which you want to check weather the year is leap year or not: ");
        int Year = Scanner.nextInt();
        if(Year % 4 ==0 && Year % 400 == 0  && Year % 100 != 0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
