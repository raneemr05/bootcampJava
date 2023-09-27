package ObjectOrientedProgramming;

public class PolymorphismDemo {
    // to add the numbers
    int a;
    int b;

    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public int add (int a, int b, int c, int d){
        int sum = a + b + c+ d;
        return  sum;
    }



    public static void main(String[] args) {
        PolymorphismDemo obj1 = new PolymorphismDemo();
        int answer = obj1.add(5,6);
        System.out.println("The answer is: " + answer);

    }

}
