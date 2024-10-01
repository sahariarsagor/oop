import java.util.*;
public class problem10 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        double num = obj.nextDouble();

        double result = Math.sqrt(num);
        System.out.println("The square root of this number is: " + result);

        obj.close();
    }
}
