package ifElse;

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Side 01 of a triangle: ");
        double side1 = obj.nextDouble();

        System.out.println("Enter Side 02 of a triangle: ");
        double side2 = obj.nextDouble();

        System.out.println("Enter side 03 of a triangle: ");
        double side3 = obj.nextDouble();

        //check is the triangle is valid or not. 
        if((side1 + side2) > side3 && (side2 + side3) > side1 && (side3 + side1) > side2){
            System.out.println("Triangle is valid");
        } else{
            System.out.println("Triangle is not valid");
        }

        obj.close();
    }
}
