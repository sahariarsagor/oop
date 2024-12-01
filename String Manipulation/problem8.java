import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String fromUser = sc.nextLine();

        int countAlphabet = 0;
        int countDigit = 0;
        int countSpecialCharacter = 0;

        for(int i = 0; i<fromUser.length(); i++){
            char ch = fromUser.charAt(i);

            if(Character.isLetter(ch)){
                countAlphabet++;
            }else if(Character.isDigit(ch)){
                countDigit++;
            } else{
                countSpecialCharacter++;
            }
        }

        System.out.println("Total alphabet is: " + countAlphabet);
        System.out.println("Total digit is: " + countDigit);
        System.out.println("Total Special Character is: " + countSpecialCharacter);
        sc.close();
    }
}
