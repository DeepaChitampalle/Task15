package org.example.fileHandling;
import java.io.File;
public class FileExit {
    public static void main(String[] args) throws Exception {
        File f = new File("example.txt");

        if(f.exists()){
            System.out.println("File Exited");
        }
        else{
            System.out.println("File Not Exists");
        }
    }
}
