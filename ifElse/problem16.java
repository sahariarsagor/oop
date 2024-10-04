package ifElse;

import java.util.Scanner;

public class problem16 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("please enter your basic salary: ");
        double basicSalary = obj.nextDouble();

        double HRA, DA;

        if(basicSalary >= 30000){
            HRA = 0.3 * basicSalary;
            DA = 0.95 * basicSalary;
        } else if(basicSalary >= 20000){
            HRA = 0.25 * basicSalary;
            DA = 0.90 * basicSalary;
        } else if(basicSalary >= 10000){
            HRA = 0.20 * basicSalary;
            DA = 0.80 * basicSalary;
        } else {
            HRA = 0;
            DA = 0;
        }

        double grossSalary = basicSalary + HRA + DA;

        System.out.println("Your HRA: " + HRA);
        System.out.println("Your DA: " + DA);
        System.out.println("Your Gross Salary: " + grossSalary);

        obj.close();
    }
}
