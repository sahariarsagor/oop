import java.util.*;
public class problem09{
      public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the base: ");
        double base = obj.nextDouble();

        System.out.println("Enter the power: ");
        int power = obj.nextInt();

        double result = Math.pow(base, power);
        System.out.println("base is: " + base + " power is " + power + " the result is: " + result);

        obj.close();
      }
}