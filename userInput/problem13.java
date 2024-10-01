import java.util.*;
public class problem13 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.err.println("Mark of First Subject: ");
        double firstSubject = obj.nextDouble();
        System.err.println("Mark of second Subject: ");
        double secondSubject = obj.nextDouble();
        System.err.println("Mark of third Subject: ");
        double thirdSubject = obj.nextDouble();
        System.err.println("Mark of fourth Subject: ");
        double fourthSubject = obj.nextDouble();
        System.err.println("Mark of Fifth Subject: ");
        double fifthSubject = obj.nextDouble();

        double totalMarks = firstSubject + secondSubject + thirdSubject + fourthSubject + fifthSubject;

        double average = totalMarks/5;
        double parcentage = (totalMarks/500) * 100;

        System.out.println("Total marks is: " + totalMarks);
        System.out.println("Average mark is: " + average);
        System.out.println("Parcentage is: " + parcentage);

        obj.close();
    }
}
