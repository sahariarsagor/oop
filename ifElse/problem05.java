package ifElse;
import java.util.Scanner;
public class problem05 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter something: ");
        char ch = obj.next().toLowerCase().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u'){
                System.out.println("Given Alphaber is an vowel");
            } else {
                System.out.println("Given Alhphabet is a consonant");
            }
        } else {
            System.out.println("Given Input is not an valid alphabet");
        }

        obj.close();
    }
}
