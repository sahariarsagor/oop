package conditionals;
import java.util.*;
public class problem03 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Year to check: ");
        int year = obj.nextInt();

        //checking is the year is leap year or not ? 

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Given Year is a leap year");
        } else{
            System.out.println("Given Year is not a leap year");
        }

        obj.close();
    }
}
