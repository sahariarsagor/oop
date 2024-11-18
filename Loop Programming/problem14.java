import java.util.Scanner;
public class problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Number: ");
        int n = sc.nextInt();

        int reverse = 0;
        while(n != 0){
            int d = n % 10;
            reverse = (reverse * 10) + d;
            n = n / 10;
        }

        System.out.println("The Reverse of this number is: " + reverse);

        sc.close();
    }
}
