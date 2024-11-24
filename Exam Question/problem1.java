import java.util.Scanner;
public class problem1{
    public static boolean isPrimeRecursion(int number, int divisor) {
        if(number <= 1){
            return false;
        }
        if(divisor == 1){
            return true;
        }
        if(number % divisor == 0){
            return false;
        }
        return isPrimeRecursion(number, divisor-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your id last two digit: ");
        int lastTwoDigit = sc.nextInt(); 
        boolean isPrime = isPrimeRecursion(lastTwoDigit, (lastTwoDigit/2)); 
        if(isPrime){
            System.out.println("Your id Last Two digit is prime");
        } else {
            System.out.println("Your Id last two digit is not prime");
        }
        sc.close();
    }
}