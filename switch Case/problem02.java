import java.util.Scanner;
public class problem02 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter day between 1 - 7: ");
        int day = obj.nextInt();

        switch(day){
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
                System.out.println("Not a valid input");
                break;
        }
        
        obj.close();
    }
}
