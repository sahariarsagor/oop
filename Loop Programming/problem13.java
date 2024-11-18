import java.util.Scanner;
public class problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Number: ");
        int n = sc.nextInt();

        int lastDigit = n%10; 
        int firstDigit = n;
        int count = 0;

        while(firstDigit >= 10){
            firstDigit /= 10;
            count++;
        }

        int sum = firstDigit + lastDigit;
        System.out.println("The summation is: " + sum);

        sc.close();
    }
}
