package org.example.fileHandling;
import java.io.File;
import java.io.IOException;
public class CreateDirectory {
    public static void main(String[] args) throws IOException {

        File dir = new File("MyFolder");

        if(dir.mkdir()){
            System.out.println("Directory created");
        }
        else{
            System.out.println("Directory already exists");
        }

    }
}
