package org.example.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDisplay {
    public static void main(String[] args) throws IOException {

        File file = new File("./FileDisplay.txt");
        if (file.createNewFile()) {
            System.out.println("File Name       : " + file.getName());
            System.out.println("Absolute Path  : " + file.getAbsolutePath());
            System.out.println("File Size      : " + file.length() + " bytes");
            System.out.println("Readable       : " + file.canRead());
            System.out.println("Writable       : " + file.canWrite());
            System.out.println("Executable     : " + file.canExecute());
        }
        else{
            System.out.println("File Not Exists");
        }

    }
}
