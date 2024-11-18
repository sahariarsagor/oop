public class problem18 {
    public static void main(String[] args){
        System.out.println("Print all ASCII Value with their Values: ");
        System.out.println("------------------------------------------");

        for(int i = 0; i<= 127; i++){
            System.out.printf("Charcter: %c, and Value is: %d%n", (char)i, i);
        }
    }
}
