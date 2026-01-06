package org.example.fileHandling;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class SerializeObject {
        public static void main(String[] args) {
            try {
                Student s1 = new Student(101, "Deepa", "secret123");

                FileOutputStream fos = new FileOutputStream("student.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(s1);

                oos.close();
                fos.close();    

                System.out.println("Object serialized successfully");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}

