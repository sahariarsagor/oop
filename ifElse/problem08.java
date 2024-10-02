package ifElse;

import java.util.Scanner;

public class problem08 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter WeekNumber Between 1 to 7");
        int weekNumber = obj.nextInt();

        switch (weekNumber) {
            case 1:
                System.out.println("Saturday");
                break;        
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thrusday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid week Number please enter valid one");

            obj.close();
        }
    }
}
