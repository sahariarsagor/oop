package ifElse;

import java.util.Scanner;

public class problem10 {

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the first angle of triangle: ");
        int angle1 = obj.nextInt();

        System.out.println("Enter the second angle of triangle: ");
        int angle2 = obj.nextInt();

        System.out.println("Enter the third angle of triangle: ");
        int angle3 = obj.nextInt();

        //checking is the triangle is valid or not ? 

        if((angle1 + angle2 + angle3) == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0){
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle is not valid");
        }

        obj.close();
    }
}