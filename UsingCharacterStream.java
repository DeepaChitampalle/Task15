package org.example.fileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class UsingCharacterStream {
        public static void main(String[] args) {
            try {
                FileWriter fw = new FileWriter("char.txt");

                String text = "Hello Java\nनमस्ते";
                fw.write(text);

                fw.close();
                System.out.println("Written using Character Stream");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}


