package ifElse;
import java.util.*;
public class problem01 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = obj.nextInt();

        if(num < 0){
            System.out.println("Given Number is Negetive");
        } else if (num > 0){
            System.out.println("Given Number is Positive");
        } else {
            System.out.println("Given Number is 0");
        }


        obj.close();
    }
}
