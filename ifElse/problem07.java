package ifElse;

import java.util.Scanner;

public class problem07 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a Alphabet: ");
        char ch = obj.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Given Alphabet is lowercase");
        } else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Given Alhaphabet is Uppercase");
        } else {
            System.out.println("Enter value is not a alphabet");
        }

        obj.close();
    }
}
