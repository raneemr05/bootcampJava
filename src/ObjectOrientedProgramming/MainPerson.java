package ObjectOrientedProgramming;

public class MainPerson {
    public static void main(String[] args) {
        // 1st object
        // Creating object using constructor
        Person person1 = new Person(1, "Muhsaab",30);
        Person person2 = new Person(2, "Nouf",30);

        System.out.println("---- 1st object details ------");
        person1.display();
        person1.eat();
        person1.sleep();

        System.out.println("---- 2nd object details ------");
        person2.display();
        person2.eat();
        person2.sleep();

        // Creating object using . operator
//        person1.id = 001;
//        person1.name = "Musaab";
//        person1.age = 30;
//        System.out.println(person1.id);
//        System.out.println(person1.name);
//        System.out.println(person1.age);


        //using the concept of encapsulation
//        Person p1 = new Person();
//        p1.setId(1);
//        System.out.println("Accessing Id using get methods");
//        System.out.println(p1.getId());

    }
}
