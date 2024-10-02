package ifElse;
import java.util.*;
public class problem04 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter something: ");
        char ch = obj.next().toLowerCase().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Given input is an alphabet");
        } else {
            System.out.println("Given Input is not an alphabet");
        }

        obj.close();
    }
}
