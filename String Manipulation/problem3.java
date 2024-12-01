import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String firstString = sc.nextLine();
        System.out.print("Enter Second String: ");
        String secondString = sc.nextLine();
        String result = firstString.concat(secondString);
        System.out.println("Final result is: " + result);
        sc.close();
    }
}
