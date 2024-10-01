import java.util.*;
public class problem12 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter side of triangle : ");
        double side = obj.nextDouble();

        double area = (Math.sqrt(3)/4) * (side * side);
        System.out.println("The area of this triangle is: " + area);

        obj.close();
    }
}
