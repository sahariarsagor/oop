import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Courses: ");
        int numberOfCourses = sc.nextInt();
        sc.nextLine(); // for a space 

        String[] courseNames = new String[numberOfCourses];
        double[] courseMarks = new double[numberOfCourses]; 
        double totalGPA = 0; 

        for(int i = 0; i < numberOfCourses; i++){
            System.out.print("Enter the name of Course " + (i+1) + ": ");
            courseNames[i] = sc.nextLine();

            System.out.print("Enter The Course Marks " + (i+1) + " : ");
            courseMarks[i] = sc.nextDouble();
            sc.nextLine();

            double gpa = calculatedGPA(courseMarks[i]);
            totalGPA = totalGPA + gpa;
        }

        double commulativeGPA = totalGPA / numberOfCourses;

        System.out.printf("Your Commulative GPA is: %.2f%n", commulativeGPA);

        if(commulativeGPA > 3.75){
            System.out.println("Excellent Result Keep it UP! ");
        } else if(commulativeGPA > 3.00){
            System.out.println("Good Result But Try for Better.");
        } else if(commulativeGPA > 2.50){
            System.out.println("Bad Result");
        } else{
            System.out.println("RED ALERT! CONSULT WITH YOUR TEACHER SOON");
        }

        sc.close();
    }

    public static double calculatedGPA(double marks){
        if(marks >= 85){
            return 4.0;
        } else  if(marks >= 75){
            return 3.5;
        } else if(marks >= 65){
            return 3.0;
        } else if(marks >= 55){
            return 2.5;
        } else if(marks >= 45){
            return 2.0;
        } else{
            return 1.5; 
        }
    }
}
