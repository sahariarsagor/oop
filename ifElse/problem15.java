package ifElse;

import java.util.Scanner;

public class problem15 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        double physics, chemistry, biology, mathmatics, computer;

        System.out.println("Enter your marks in physics: ");
        physics = obj.nextDouble();

        System.out.println("Enter your marks in Chemistry: ");
        chemistry = obj.nextDouble();

        System.out.println("Enter your marks in Biology: ");
        biology = obj.nextDouble();

        System.out.println("Enter your marks in mathmatics: ");
        mathmatics = obj.nextDouble();

        System.out.println("Enter your marks in Computer: ");
        computer = obj.nextDouble();

        double total = physics + chemistry + biology + mathmatics + computer;

        double parcentage = (total/500)*100;

        if(parcentage >= 90){
            System.out.println("Your grader is: A");
        } else if(parcentage >= 80){
            System.out.println("Your grade is: B");
        } else if(parcentage >= 70){
            System.out.println("Your grade is: C");
        } else if(parcentage >=  60){
            System.out.println("Your grade is: D");
        } else if(parcentage >= 40){
            System.out.println("your grade is: E");
        } else {
            System.out.println("Your grade is: F");
        }

        obj.close();
    }
}
