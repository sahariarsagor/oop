import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String fromUser = sc.nextLine();
        String[] w = fromUser.split("\\s+");
        int countedWord = w.length;
        System.out.println("length is: "+ countedWord);
        sc.close();
    }
}
