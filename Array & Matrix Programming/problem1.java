import java.util.Scanner;
public class problem1{
    public static void printArray(int[] arr, int index){
        if(index == arr.length){
            return;
        }

        System.out.println(arr[index]);
        printArray(arr, index+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array Element: ");
        for(int i = 0; i< size; i++){
            System.out.print("Enter " + i + " no element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing Array Element: ");
        printArray(arr, 0);
        sc.close();
    }
}