class student{
    private String universityName = "City University"; 
    private String name;
    private int rollNumber;
    private student nextStudent; 

    public student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber; 
    }

    public void setNextStudent(student nextStudent){
        this.nextStudent = nextStudent; 
    }

    public void displayStudentDetails() {
        System.out.println(universityName);
        System.out.println("Name: " + name);
        System.out.println("Serial: " + rollNumber);

        if (nextStudent != null) {
            System.out.println("Name: " + nextStudent.name);
            System.out.println("Serial: " + nextStudent.rollNumber);
        }
    }
}

public class problem3 {
    public static void main(String[] args) {
        student currentStudent = new student("Atiya Alamgir", 1);
        student nextStudent = new student("Shova Tasmi", 2); 

        currentStudent.setNextStudent(nextStudent);
        currentStudent.displayStudentDetails();
    }
}