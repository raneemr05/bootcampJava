import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {



    public static void main(String[] args) throws IOException {

//        FileWriter myWriter = new FileWriter("myFile.txt", true);
//
//        //Writing to the file
//        myWriter.write("This is my first file \n");
//        myWriter.write("I am quite happy \n");
//        System.out.println("File created and content added successfully");
//        myWriter.close();

        //Reading from the file
        File file = new File("myFile.txt");
        //Scanner object to iterate over the file
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);
        }

        //close buffer
        sc.close();
    }
}
