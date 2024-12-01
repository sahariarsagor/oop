import java.util.Scanner;
public class problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String myString = sc.nextLine();
        int stringLength = myString.length();
        System.out.println("The Length of your string is: " + stringLength);
        sc.close();
    }
}