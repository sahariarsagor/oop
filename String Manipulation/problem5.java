import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String in Lower case: ");
        String userInput = sc.nextLine();
        String result = userInput.toUpperCase();
        System.out.println("Your String in Uppercase is: " +result);
        sc.close();
    }
}
