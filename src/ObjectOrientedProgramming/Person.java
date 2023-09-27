package ObjectOrientedProgramming;

class Person {
    // 4 states or fields or properties
    int id;
    String name;
    int age;

//    public int getId()
//    {
//        return  id;
//    }
//
//    public void setId(int id){
//        this.id = id;
////        if(id < 0 ){
////            System.err.println("");
////        }
////        else{
////            this.id = id;
////        }
//    }

    public Person(int id ,String name, int age){
        this.id  = id;
        this.age = age;
        this.name = name;
    }

    public void display(){
        System.out.println("The id: " + id);
        System.out.println("The name: " + name);
        System.out.println("The age is: " + age);
    }

    public void sleep(){
        System.out.println("Person sleeps well");
    }
    public void eat(){
        System.out.println("Person does eating");
    }


}
