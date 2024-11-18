import java.util.Scanner;
public class problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

            System.out.print("Enter the base : ");
            double base = sc.nextDouble();
            System.out.print("Enter the exponent: ");
            double ex = sc.nextDouble();

            double result = 1;
            for(int i = 1; i <= ex; i++){
                result = result * base; 
            }

            System.out.println("The result is: " + result);
            
        sc.close();
    }
}
