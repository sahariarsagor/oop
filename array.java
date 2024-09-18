//import java util
import java.util.*;
public class array {
    public static void main(String args[]){
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter array length: ");
        n = obj.nextInt();

        int sum = 0;
        int[] numbers = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print( (i+1) + " no element: ");
            numbers[i] = obj.nextInt();
            sum = sum + numbers[i];
        }
        int avg = sum/n;
        System.out.println("The Summation of this array is: " + sum);
        System.out.println("The average of these number is: " + avg);

        obj.close();

    }
}