import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter " + i + " no element: ");
            arr[i] = sc.nextInt();
        }

        //negetive element:
        boolean negetiveFinder = false; 
        for(int j = 0; j< size; j++){
            if(arr[j] < 0){
                System.out.println("Negetive element: " + arr[j]);
                negetiveFinder = true;
            }
        }

        if(!negetiveFinder){
            System.out.println("No Negetive element there. ");
        }
        sc.close();
    }
}
