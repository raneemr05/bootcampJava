import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Take input of the username
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);

        System.out.println("Please enter your age");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("Welcome" + name);
        }
        else
        {
            System.err.println("Sorry, Access forbidden");
        }
    }
}
