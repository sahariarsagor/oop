import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            System.out.print("Enter " + i + " no element: ");
            arr[i] = sc.nextInt();
        }

        int[] copyArray = new int[size];
        for(int i = 0; i<size; i++){
            copyArray[i] = arr[i];
        }

        //printing array element: 
        for(int i = 0; i<size; i++){
            System.out.print(copyArray[i] + " ");
        }

        sc.close();
    }
}
