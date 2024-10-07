import java.util.Scanner;

public class problem04 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = obj.nextInt();

        int sum = 0;

        for(int i = 1; i<= n; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("The sum of odd number between 1 to " + n + " is: " + sum);;
        
        obj.close();
    }
}
