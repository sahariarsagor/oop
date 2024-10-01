import java.util.*;
public class problem14 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter principal: ");
        double principal = obj.nextDouble();

        System.out.println("Enter time: ");
        double time = obj.nextDouble();

        System.out.println("Enter rate: ");
        double rate = obj.nextDouble();

        double simpleInterest = (principal * time * rate) / 100;
        double compoundInterest = principal * (Math.pow((1 + rate / 100), time) - 1);

        System.out.println("Calculated simple interest are: " + simpleInterest);
        System.out.println("Calculated Compound interest are: " + compoundInterest);

        obj.close();
    }
}
