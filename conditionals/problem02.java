package conditionals;
import java.util.*;
public class problem02 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number for check: ");
        int num = obj.nextInt();

        if(num % 2 == 0){
            System.out.println("Given number is even");
        } else {
            System.out.println("Given Number is odd");
        }

        obj.close();
    }
}
