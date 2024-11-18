import java.util.Scanner;
public class problem17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("To word: " + convertWord(n));

        sc.close();
    }

    public static String convertWord(int n){
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String result = "";

        int reverse = 0;
        while(n > 0){
            int digit = n % 10;
            reverse = (reverse*10) + digit;
            n/=10;
        }

        while(reverse > 0){
            int digit = reverse % 10;
            result += words[digit] + " ";
            reverse /= 10;
        }

        return result.trim();
    }
}