package ObjectOrientedProgramming;

public class InheritanceImpl {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nawaf", 30,"Java Bootcamp", true);
        System.out.println("--- The student details are:  ----- ");
        student1.display();
        student1.sleep();
    }
}
