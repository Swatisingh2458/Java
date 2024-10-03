import java.util.Scanner;

public class CategorizeAge {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int Age = Scanner.nextInt();
        if(Age>=60){
            System.out.println("Senior");
        }
        else if(Age<60 && Age>30)
        {
            System.out.println("Adult");
        }
        else if(Age<30 && Age>10)
        {
            System.out.println("Teenage");
        }
        else {
            System.out.println("Childss");
        }
    }
}
