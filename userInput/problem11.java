import java.util.*;
public class problem11 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.err.println("Enter first Angle: ");
        double angle1 = obj.nextDouble();

        System.out.println("Enter Second Angle: ");
        double angle2 = obj.nextDouble();

        double angle3 = 180 - (angle1 + angle2);
        System.out.println("Third angle of this triangle is: " + angle3);

        obj.close();
    }
}
