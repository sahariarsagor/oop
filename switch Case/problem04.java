import java.util.Scanner;
public class problem04 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = obj.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = obj.nextInt();

        int caseSelector ;

        if(num1 > num2){
            caseSelector = 1;
        } else if( num2 > num1){
            caseSelector = 2;
        } else {
            caseSelector = 3;
        }

        switch(caseSelector){
            case 1:
                System.out.println("Number 01 is greater than number 02");
                break;
            case 2:
                System.out.println("Number 02 is greater than number 01");
                break;
            case 3:
                System.out.println("Number 01 and number 02 are equal");
                break;
            default:
                System.out.println("Unspected case");
                break;
        }

        obj.close();
    }
}
