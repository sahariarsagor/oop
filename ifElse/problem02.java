package ifElse;
import java.util.*;
public class problem02 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = obj.nextInt();

        if(num % 5 == 0 && num % 11 == 0){
            System.out.println("Given Number is divisible by 5 and 11");
        } else {
            System.out.println("Given Number is not divisible by 5 and 11");
        }

        obj.close();
    }
}
