import java.util.Scanner;

public class problem01 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Please Enter a Alphabet: ");
        char ch = obj.next().charAt(0);
        ch = Character.toLowerCase(ch);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Given Alphabet is an vowel");
                break;
            default:
                if(ch >= 'a' && ch <= 'z'){
                    System.out.println("Given alphabet is an consonant");
                } else {
                    System.out.println("Given input is not an alphabet");
                }
                break;
        }

        obj.close();
    }
}
