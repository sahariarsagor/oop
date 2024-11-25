import java.util.Scanner;
public class problem3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter " + i + " no element: ");
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        for(int i = 0; i<size; i++){
            sum += arr[i];
        }

        System.out.println("Sum of all array element is: " + sum);

        sc.close();
    }
}
