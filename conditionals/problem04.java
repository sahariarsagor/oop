package conditionals;
import java.util.*;
public class problem04 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = obj.next().charAt(0);

        if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
            System.out.println("Its a Characcter");
        } else {
            System.out.println("Its not a character");
        }

        obj.close();
    }
}
