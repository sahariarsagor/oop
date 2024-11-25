import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size =sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            System.out.print("Enter " + i + " no element: ");
            arr[i] = sc.nextInt();
        }

        int negetiveCount = 0;
        for(int j = 0; j<size; j++){
            if(arr[j] < 0){
                negetiveCount++;
            }
        }

        System.out.println("Total negetive element in array: " + negetiveCount);

        sc.close();
    }
}
