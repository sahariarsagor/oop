import java.util.Scanner;

public class problem06 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = obj.nextInt();

        System.out.println("Multiplication table for " + n + " is: ");

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }

        obj.close();
    }
}
