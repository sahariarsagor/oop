import java.util.*;
public class problem02 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter The Length: ");
        double length = obj.nextDouble();

        System.out.println("Enter the breadth: ");
        double breadth = obj.nextDouble();

        double perimeter = 2*(length + breadth);

        double area = length*breadth;

        System.out.println("The perimeter of this rectangular is: " + perimeter);

        System.out.println("The area of this rectangular is: " + area);

        obj.close();
    }
}
