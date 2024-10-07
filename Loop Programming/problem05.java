import java.util.Scanner;

public class problem05 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = obj.nextInt();

        System.out.println("Prime Number is: ");
        for (int i = 2; i <= n; i++){
            boolean isPrime = true;

            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print( i + " ");
            }
        }



        obj.close();
    }
}
