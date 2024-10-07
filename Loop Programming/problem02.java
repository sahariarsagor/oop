import java.util.Scanner;

public class problem02 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        char letter = 'a';
        System.out.println("Printing letter a to z: ");

        while(letter <= 'z'){
            System.out.print(letter + " ");
            letter++;
        }

        obj.close();
    }
}
