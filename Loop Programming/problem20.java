import java.util.Scanner;
public class problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter limit n: ");
            int n = sc.nextInt();

            for(int i = 1; i<=n; i++){
                if(n % i == 0){
                    System.out.println(i);
                }
            }

        sc.close();
    }
}
