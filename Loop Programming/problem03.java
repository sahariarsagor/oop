import java.util.Scanner;

public class problem03 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number (n): ");
        int n = obj.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of all even number between 1 to " + n +" is "+ sum);

        obj.close();;
    }
}
