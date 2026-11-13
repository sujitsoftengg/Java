package Ch18_FileHandling.Chalanges;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadFile {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter File Name : ");
        String userFile = input.next();
        String userWantReadFile = userFile.concat(".txt");

        try(FileReader reader = new FileReader(userWantReadFile)){
            int read = 0;
            do {
                read = reader.read();
                System.out.println((char) read);
            }while (read != -1);



            /*

            int read;
            while ((read = reader.read()) != -1){
                System.out.println((char) read);
            }


             */

        }catch (FileNotFoundException e){
            System.out.printf("File Not Found %s \n", e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

}
