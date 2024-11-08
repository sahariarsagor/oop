import java.util.Scanner;
public class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int product = 1;
        int temp = Math.abs(number);
        
        if(temp == 0){
            System.out.println("Product is 0");
        } else {
            while(temp > 0){
                product = product * (temp%10);
                temp /= 10;
    
            }
        }

        System.out.println("The product of digit: " + product);
        sc.close();
    }
}
