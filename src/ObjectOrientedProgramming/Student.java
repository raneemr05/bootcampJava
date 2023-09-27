package ObjectOrientedProgramming;

public class Student extends  Person {
    String courseName;
    Boolean isEnrolled;


    public Student(int id, String name, int age, String courseName, Boolean isEnrolled ) {
        super(id, name, age);
        this.courseName = courseName;
        this.isEnrolled = isEnrolled;
    }

    public void display(){
        super.display();
        System.out.println("The course name is " +courseName +
        "The student is " + isEnrolled);
    }

    public void sleep(){
        System.out.println("Student sleeps 5hrs only");
    }
}
