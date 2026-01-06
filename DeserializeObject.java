package org.example.fileHandling;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class DeserializeObject {

        public static void main(String[] args) {
            try {
                FileInputStream fis = new FileInputStream("student.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);

                Student s = (Student) ois.readObject();

                ois.close();
                fis.close();

                System.out.println("Object deserialized successfully");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e) {
                System.out.println("Class not found during deserialization");
            }
        }
    }


