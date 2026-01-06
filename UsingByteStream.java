package org.example.fileHandling;
import java.io.FileOutputStream;
import java.io.IOException;
public class UsingByteStream {
        public static void main(String[] args) {
            try {
                FileOutputStream fos = new FileOutputStream("byte.txt");

                String text = "Hello Java\nनमस्ते";
                fos.write(text.getBytes());   // uses default encoding

                fos.close();
                System.out.println("Written using Byte Stream");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}


