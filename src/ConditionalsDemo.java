public class ConditionalsDemo {
    public static void main(String[] args) {

//        byte age = 51;
//        if(age >= 18 && age <= 50 ){
//            System.out.println("You're eligible to drive");
//        }
//        else{
//            System.out.println("You're not eligible");
//        }

        //Switch case
        int day = 5;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Its a weekend");
                break;
        }
    }
}
