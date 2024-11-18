import java.util.Scanner;
public class problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a Number: ");
        int n  = sc.nextInt();

        int temp = Math.abs(n);
        int[] frequency = new int[10];

        while (temp != 0) {
            int digit = temp % 10;
            frequency[digit]++;
            temp /= 10;
        }

        for(int i = 0; i<10; i++){
            if(frequency[i] > 0){
                System.out.println("Number " + i + " : " + frequency[i] + "times. ");
            }

        }

        sc.close();
    }
}
