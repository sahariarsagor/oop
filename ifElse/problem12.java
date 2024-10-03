package ifElse;

import java.util.Scanner;

public class problem12 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter side 01 of your triangle: ");
        double side1 = obj.nextDouble();

        System.out.println("Enter side 02 of a triangle: ");
        double side2 = obj.nextDouble();

        System.out.println("Enter side 03 of a triangle: ");
        double side3 = obj.nextDouble();

        if((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1){

            if(side1 == side2 && side2 == side3){
                System.out.println("This triangle is a Equilateral Triangle");
            } else if(side1 == side2 || side2 == side3 || side1 == side3){
                System.out.println("This triangle is an Isosceles triangle");
            } else {
                System.out.println("This triangle is an Scalene triangle");
            }

        } else {
            System.out.println("Triangle is invalid");
        }

        obj.close();
    }
}
