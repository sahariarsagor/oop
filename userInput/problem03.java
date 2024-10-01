import java.util.*;
public class problem03 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the radius of circle: ");
        double radius = obj.nextDouble();

        double  PI = 3.1416;
        double diameter = 2*radius;
        double circumference = 2 * (PI * radius);
        double area = PI*(radius*radius);

        System.out.println("The diameter of this circle is: " + diameter);
        
        System.out.println("The circumference of this circle is: "+ circumference);

        System.out.println("The area of this circle is: " + area);

        obj.close();
    }
}
