import java.util.Scanner;

public class problem7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String fromUser = sc.nextLine();
        StringBuilder nothing = new StringBuilder();

        for(int i = 0; i<fromUser.length(); i++){
            char ch = fromUser.charAt(i);

            if(Character.isUpperCase(ch)){
                nothing.append(Character.toLowerCase(ch));
            } else if(Character.isLowerCase(ch)){
                nothing.append(Character.toUpperCase(ch));
            } else{
                nothing.append(ch);
            }
        }
        System.out.println("User given input: " + fromUser);
        System.out.println("Toggled: " + nothing);
        sc.close();
    }
}