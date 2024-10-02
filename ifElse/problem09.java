package ifElse;

import java.util.Scanner;

public class problem09 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter month number between 1 to 12");
        int monthNumber = obj.nextInt();

        switch (monthNumber){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: 
                System.out.println("Number of days in this month is 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days in this month is 30");
                break;
            case 2:
                System.out.println("Enter Year Please: ");
                int year = obj.nextInt();
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    System.out.println("Number of days of this month is 29");
                } else {
                    System.out.println("Number of days in this month is 28");
                }
            break;
            default:
                System.out.println("Invalid number please enter valid one");
        }

        obj.close();
    }
}
