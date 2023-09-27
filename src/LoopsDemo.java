import java.util.Arrays;

public class LoopsDemo {
    public static void main(String[] args) {
        //Print 34 students name
//        String student1 = "Nouf";
//        String student2 = "AbdulAziz";
//        //...... student34
        //use Arrays
        //use loops
//        String[] names

//        int[] numbers = {4,7,1};
//        Arrays.sort(numbers);
//        String result = Arrays.toString(numbers);
//        System.out.println(result);

            String[] names = {"Nouf","Hamoud","Razan","Manar","Noura","Zeynab","Kholoud","Nawaf","Ahmed","Musab","Waleed","Fahad","Muhammad"};
        // System.out.println("Printing using For Loop");
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
        for (int i = names.length - 1; i >= 0; i--)
        {
            System.out.println(names[i]);
        }

//        System.out.println("Printing using While Loop");
//        //While loop
//        int i =0;
//        while(i<names.length){
//            System.out.println(names[i++]);
//        }
//        System.out.println("Printing using Do While Loop");
//        //Do-While loop
//        int i =0;
//        do{
//            System.out.println(names[i++]);
//        } while (i <names.length);
//
////        for (String name:
////            names ) {
////            System.out.println(name);
////        }

    }
}
