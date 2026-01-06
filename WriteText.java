package org.example.fileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteText {
    public static void main(String[] args) {
            try {
                FileWriter fw = new FileWriter("text.txt");

                fw.write("Hello Character Stream\n");
                fw.write("i m learning java");

                fw.close();
                System.out.println("Text written successfully");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}


