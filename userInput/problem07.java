import java.util.*;
public class problem07 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Temperature in farenheight: ");
        double fahrenheit = obj.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Temperature in Celsius: %.2f%n", celsius);

        obj.close();
    }
}