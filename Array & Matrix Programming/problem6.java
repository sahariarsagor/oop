import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter " + i + " no element: ");
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j<size; j++){
            if(arr[j]%2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Total even number in array: " + evenCount);
        System.out.println("Total odd number in array: " + oddCount);
        sc.close();
    }
}
