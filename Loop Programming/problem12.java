import java.util.Scanner;
public class problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter a Number: ");
            int n = sc.nextInt();

            int lastDigit = n % 10; 
            int firstDigit = n;
            int count = 0; 
            
            while(firstDigit >= 10){
                firstDigit = firstDigit / 10; 
                count++; 
            }

            int pow = (int) Math.pow(10, count);
            int remaining = (n % pow) / 10; 
            int finalResult = (lastDigit * pow) + (remaining * 10) + firstDigit;

            System.out.println("Final result is: " + finalResult);

        sc.close();
    }
}
