import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];

        for(int i = 0; i<size;i++){
            System.out.print("Enter " + i + " no element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element of you insert : ");
        int insert = sc.nextInt();
        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        for(int i = size; i > position; i--){
            arr[i] = arr[i - 1];
        }

        arr[position] = insert;
        System.out.print("Updated array: ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
