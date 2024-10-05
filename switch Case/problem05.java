import java.util.Scanner;
public class problem05 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Please Enter Number: ");
        int num = obj.nextInt();

        switch (num % 2 ){
            case 0:
                System.out.println("Given Number is Even");
                break;
            case 1:
                System.out.println("Given Number is Odd");
                break;
            default:
                System.out.println("Unspected Case");
                break;
        }

        obj.close();
    }
}
