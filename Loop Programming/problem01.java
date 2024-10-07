import java.util.Scanner;

public class problem01 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = obj.nextInt();

        while(n >= 1){
            System.out.print(n + " ");
            n--;
        }

        obj.close();
    }
}
