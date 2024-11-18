import java.util.Scanner;
public class problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Number: ");
        int n = sc.nextInt();

        int number = n;
        int reverse = 0;

        while (n != 0) {
            int ld = n%10;
            reverse = (reverse * 10) + ld;
            n /= 10;
        }

        if(reverse == number){
            System.out.println("Given Number is Palindrome");
        } else {
            System.out.println("Given Number is not Palindrome");
        }

        sc.close();
    }
}
