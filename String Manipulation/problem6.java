import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String in UpperCase : ");
        String userInput = sc.nextLine();
        String result = userInput.toLowerCase();
        System.out.println("Your String in LowerCase is: " + result);
        sc.close();
    }
}
