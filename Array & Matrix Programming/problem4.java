import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter " + i + " no element: ");
            arr[i] = sc.nextInt();
        }

        int maximum = findMax(arr, 0, arr[0]);
        System.out.println("Maximum element: " + maximum);
        int minimum = findMin(arr, 0, arr[0]);
        System.out.print("Minimum element is: " + minimum);

        sc.close();
    }

    public static int findMax(int[] arr, int index, int max) {
        if (index == arr.length) {
            return max; 
        }
        if (arr[index] > max) {
            max = arr[index]; 
        }
        return findMax(arr, index + 1, max); 
    }

    public static int findMin(int[] arr, int index, int min){
        if(index == arr.length){
            return min;
        }

        if(arr[index] < min){
            min = arr[index];
        }

        return findMin(arr, index+1, min);
    }
}

