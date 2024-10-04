package ifElse;

import java.util.Scanner;

public class problem17 {
    public static void main(String[] args){
        // Create Scanner object for input
        Scanner obj = new Scanner(System.in);

        // Input: number of electricity units consumed
        System.out.print("Enter units: ");
        double units = obj.nextDouble();

        // Initialize total bill
        double totalBill = 0;

        // Calculate total bill based on the unit consumption ranges
        if (units <= 50) {
            totalBill = units * 0.50; // First 50 units
        } else if (units <= 150) {
            totalBill = (50 * 0.50) + ((units - 50) * 0.75); // Next 100 units
        } else if (units <= 250) {
            totalBill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20); // Next 100 units
        } else {
            totalBill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50); // Above 250 units
        }

        // Calculate 20% surcharge on the total bill
        double surcharge = totalBill * 0.20;
        double totalBillWithSurcharge = totalBill + surcharge;

        // Output the final bill amount
        System.out.printf("Total Bill (including surcharge): BDT %.2f%n", totalBillWithSurcharge);

        // Close the scanner
        obj.close();
    }
}
