package conditionals;
import java.util.*;
public class problem01 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Number 01: ");
        int num1 = obj.nextInt();

        System.out.println("Enter number 02: ");
        int num2 = obj.nextInt();

        System.out.println("Enter number 03: ");
        int num3 = obj.nextInt();

        //find max number: 
        if(num1 > num2 && num1 > num3){
            System.out.println("Num 1 is greater than all");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 02 is greater than all");
        } else {
            System.out.println("Number 03 is greater than all");
        }

        //finding minimum number: 
        if (num1 < num2 && num1 < num3) {
            System.out.println("Number 01 is smaller than all");
        } else if(num2 < num1 && num2 < num3){
            System.out.println("Number 02 is smaller than all");
        } else{
            System.out.println("Number 03 is smaller than all");
        }
 
        obj.close();
    }    
}
