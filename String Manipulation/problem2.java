import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String originalString = sc.nextLine();
        String copy = new String(originalString);

        System.out.println("Original String is: " + originalString);
        System.out.println("Copy version is: " + copy);
        sc.close();
    }
}
