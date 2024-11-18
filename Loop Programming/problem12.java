import java.util.Scanner;
public class problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int lastDigit = n % 10; 
        int firstDigit = n;
        int count = 0;

        while(firstDigit >= 10){
            firstDigit = firstDigit / 10;
            count++;
        }

        int pro = (int) Math.pow(10, count);
        int remaining = (n % pro)/10;
        int finalResult = (lastDigit*1000) + (remaining*10) + firstDigit;
        System.out.println("Final Result is: " + finalResult);
        sc.close();
    }
}
