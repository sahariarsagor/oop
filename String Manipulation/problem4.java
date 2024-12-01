import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String firstString = sc.nextLine();
        System.out.print("Enter Second String: ");
        String secondString = sc.nextLine();

        //Testing two string case sensitive way. 
        if(firstString.equals(secondString)){
            System.out.println("String both are equal");
        } else {
            System.out.println("String both are not equal");
        }
        //testing two String non case sensitive way 
        if(firstString.equalsIgnoreCase(secondString)){
            System.out.println("String Both are equal");
        } else{
            System.out.println("String both are not same");
        }

        // now compare: 
        int result = firstString.compareTo(secondString);
        if(result == 0){
            System.out.println("String both are equal");
            
        } else{
            System.out.println("String Both are not equal");
        }
        sc.close();
    }
}
