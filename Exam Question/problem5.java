import java.util.Scanner;

public class problem5 {

    public static int checkFactorial(int num){
        if(num <= 1){
            return 1;
        }else{
            return num * checkFactorial(num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your id last digit: ");
        int idLastDigit = sc.nextInt();

        int result = checkFactorial(idLastDigit);
        System.out.println("Factorial: " + result);
        sc.close(); 
    }
}
