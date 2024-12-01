import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String fromUser = sc.nextLine();

        int vowelCounter = 0;
        int consonantCounter = 0;
        String mySubidah = fromUser.toLowerCase();
        for(int i = 0; i<mySubidah.length(); i++){
            char ch = mySubidah.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCounter++;
            } else{
                consonantCounter++;
            }
        }

        System.out.println("Total vowel in this string is: " + vowelCounter);
        System.out.println("Total consonant in this string is: " + consonantCounter);
        sc.close();
    }
}
