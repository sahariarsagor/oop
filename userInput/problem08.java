import java.util.*;
public class problem08 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Days: ");
        int totalDays = obj.nextInt();

        int years = totalDays/365;
        int weeks = (totalDays % 365) / 7;
        int days = (totalDays % 365) % 7;

        System.out.println("calculated total " + years + " years " + weeks +" weeks " + days +  " Days");

        obj.close();
    }
}
