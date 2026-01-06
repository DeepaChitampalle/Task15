package org.example.fileHandling;
import java.io.File;
public class FileExample {
    public static void main(String[] args) throws Exception{
        File f = new File("example.txt");

        if(f.createNewFile()) {
            System.out.println("File created successfully");
        }
            else{
              System.out.println("File already exists");
            }

    }
}
