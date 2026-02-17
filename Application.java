import java.util.Scanner;
class Student {
    Scanner BSE =  new Scanner(System.in);
    private  String name;
    private int StudentID;
    private String Course;
    double marks;
    
    Student(String name, int StudentID, double marks, String Course){
        //constructor to initialize the private variables in the student class
        this.name = name;
        this.StudentID = StudentID;
        this.marks = marks;
        this.Course = Course;
    }
    @Override //toString operation will be overriden by void input 
    public String toString(){
        return "Student Name: " + name + "\nStudent ID: " +StudentID + "\nMarks: " + marks + "\nCourse: "+ Course;
    }
    public void input() {
        System.out.println("Enter the name of the student: ");
        name = BSE.nextLine();
        System.out.println("Enter the studentID: ");
        StudentID = BSE.nextInt();
        
        System.out.println("Enter the marks of the student: ");
        marks = BSE.nextDouble();
        BSE.nextLine();  //erases the newline created by nextDouble allowing iput of course name
        System.out.println("Enter the course of the student: ");
        Course = BSE.nextLine();
    }
    
}
interface Exam{
    void Calculate_Grade();
}
class Grade extends Student implements Exam {
    public void Calculate_Grade(){
        input();
        if (marks >= 90) {
            System.out.println(" Grade A");
        }
        else if (marks >=80){
            System.out.println(" Grade B");
        }
        else if (marks >=70){
            System.out.println(" Grade C");
        }
        else if (marks >=60){
            System.out.println(" Grade D");
        }
        else if(marks >=50){
            System.out.println(" Grade E");
        }
        else {
            System.out.println("FAIL- Do Supplementary");
        }
    }
    Grade(){
        super("",0101,89,"");//initializes instances of  the values to be input by the user in the input method
    }
}
public class Application extends Grade {
    public static void main(String[] args){
        Grade Stud1 = new Grade();
        Stud1.Calculate_Grade();//call the function to calculate the grade of the student

    }
}
