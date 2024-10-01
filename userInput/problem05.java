import java.util.*;
public class problem05 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter length in centimeter: ");
        double length = obj.nextDouble();

        double meters = length/100;
        double kilometers = length/100000;

        System.out.println("Entered length in meter is: " + meters);
        System.out.println("Entered length in Kilometer is: " + kilometers);

        obj.close();
    }
}
