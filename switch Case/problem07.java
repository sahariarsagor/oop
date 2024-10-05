import java.util.Scanner;
public class problem07 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Number 01: ");
        double num1 = obj.nextDouble();

        System.out.println("Enter number 02: ");
        double num2 = obj.nextDouble();

        System.out.println("Choose an Operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");


        System.out.println("Enter Your Choise: ");
        int choice = obj.nextInt();

        double sum = num1 + num2;
        double sub = num1 - num2;
        double product = num1 * num2;
        double div = num1 / num2;

        switch(choice){
            case 1:
                System.out.println("Summation of these two number is: " + sum);
                break;
            case 2:
                System.out.println("Substraction of these two number is: " + sub);
                break;
            case 3:
                System.out.println("Multiplication of these two number is: " + product);
                break;
            case 4:
                System.out.println("Division of this two number is: " + div);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

        obj.close();
    }
}
