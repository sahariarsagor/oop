import java.util.*;
public class problem06 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Temperature in celcius: ");
        double temperature = obj.nextDouble();

        double farenheight = (temperature * (9/5)) + 32;
        System.out.println("Temperature in farenheight is: " + farenheight);

        obj.close();
    }
}
