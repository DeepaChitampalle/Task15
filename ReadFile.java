package org.example.fileHandling;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadFile {
            public static void main(String[] args) {
                try {
                    FileInputStream fis = new FileInputStream("data.txt");

                    int i;
                    while ((i = fis.read()) != -1) {
                        System.out.print((char) i);
                    }

                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
}

