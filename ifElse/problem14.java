package ifElse;

import java.util.Scanner;
public class problem14 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the cost price: ");
        double costPrice = obj.nextDouble();

        System.out.println("Enter the selling price: ");
        double sellPrice = obj.nextDouble();

        //checking is profit or loss? 
        if(costPrice > sellPrice){
            double loss = costPrice - sellPrice;
            System.out.println("you made a loss: " + loss);
        } else if(costPrice < sellPrice){
            double profit = sellPrice - costPrice;
            System.out.println("You made profit " + profit);
        } else {
            System.out.println("There was no profit or loss");
        }

        obj.close();
    }
}
