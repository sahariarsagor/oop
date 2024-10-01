import java.util.Scanner;

public class problem01 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        double firstNum = obj.nextDouble();

        System.out.println("Enter Second Number: ");
        double secondNum = obj.nextDouble();

        double sum = firstNum + secondNum;

        System.out.println("The sum of these two number is: " + sum);

        obj.close();
    }
}
