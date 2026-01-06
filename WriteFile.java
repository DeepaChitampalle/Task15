package org.example.fileHandling;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteFile {
        public static void main(String[] args) {
            try {
                FileOutputStream fos = new FileOutputStream("data.txt");

                String msg = "Hello Byte Stream";
                byte[] b = msg.getBytes();

                fos.write(b);
                fos.close();

                System.out.println("Data written successfully");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}

