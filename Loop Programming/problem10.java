import java.util.Scanner;
public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number =  sc.nextInt();

        int sum = 0;
        int temp = Math.abs(number);

        while(temp > 0){
            sum = sum + (temp % 10);
            temp /= 10;
        }

        System.out.println("Sum of digit of any number: " + sum);

        sc.close();
    }
}
