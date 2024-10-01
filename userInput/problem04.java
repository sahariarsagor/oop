import java.util.*;
public class problem04{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the base of triangle: ");
        double base = obj.nextDouble();

        System.out.println("Enter the height of Triangle: ");
        double height = obj.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of this triangle is: " + area);

        obj.close();
    }
}
