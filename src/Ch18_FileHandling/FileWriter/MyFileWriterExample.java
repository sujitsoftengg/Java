package Ch18_FileHandling.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriterExample {


    static void main(String[] args) {
        String fileName = "sujittomar.txt";
        try(FileWriter writer = new FileWriter(fileName) ) {
            writer.write("Sujit Tomar best Java Developer \n");
            writer.write("This is file handling dummy file \n");
            for (int i = 0; i < 10000; i++) {
                writer.write("*");
            }
            writer.flush();
            System.out.println("Written Sucessfully");
        }catch (IOException e){
            System.out.printf("Exception Occurred %s \n", e.getMessage() );
        }



    }


}
