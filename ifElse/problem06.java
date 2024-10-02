package ifElse;

import java.util.Scanner;

public class problem06 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Something: ");
        char ch = obj.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("Given Input is an alphabet");
        } else if(ch >= '0' && ch <= '9'){
            System.out.println("Given Input is an digit");
        } else {
            System.out.println("Given Input is a special character");
        }

        obj.close();
    }
}
