import java.util.Scanner;
public class problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        if(number == 0){
            System.out.println("Number of Digit is: 0");
        } else {
            int count = 0;
            int temp = Math.abs(number);

            while(temp > 0){
                temp /= 10;
                count++;
            }

            System.out.println("Number of digit is: " + count);
        }

        sc.close();
    }
}
