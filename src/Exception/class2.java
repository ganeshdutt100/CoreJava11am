package Exception;

import java.io.File;
import java.io.FileReader;
import  java.io.FileNotFoundException;

public class class2 {
    public static void main(String[] args) {
        try{
            File file = new File("Ayush.txt");
            FileReader reader = new FileReader(file);
        }
      catch (FileNotFoundException e) {
          System.out.println("File not found : "+ e.getMessage());
        }
    }
}
