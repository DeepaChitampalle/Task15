package org.example.fileHandling;
import java.io.FileWiter;
import java.io.IOException;
public class UsingCharacterStream {
        public static void main(String[] args) {
            try {
                FileWriter f = new FileWiter("char.txt");

                String text = "Hello Java\nनमस्ते";
                f.write(text);

                f.close();
                System.out.println("Written using Character Stream");
            }catch(IOException e){
                e.printStackTrace();   
            }
        }
}




