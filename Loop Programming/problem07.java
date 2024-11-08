import java.util.Scanner;
public class problem07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Number: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Please Enter a Positive Number");
        } else {
            int sum = 0;
            for(int i = 1; i<=n; i++){
                sum += i; // sum =  sum + i; 
            }

            System.out.println("The sum of all natural number between 1 to " + n + " : " + sum);
        }


        sc.close();
    }
}
