import java.util.Scanner;

public class GradesCheck {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter your Percentage");
        float Percentage = Scanner.nextFloat();
        if(Percentage >= 90)
        {
            System.out.println("Garde A");
        }
        else if(Percentage <= 90 && Percentage > 75)
        {
            System.out.println("Garde B");
        }
        else if(Percentage <= 75 && Percentage > 60)
        {
            System.out.println("Garde C");
        }
        else if(Percentage <= 60 && Percentage > 30)
        {
            System.out.println("Garde D");
        }
        else {
            System.out.println("Grade F");
        }
    }
}
