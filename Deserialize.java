package org.example.fileHandling;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class Deserialize {
        public static void main(String[] args) {
            try {
                FileInputStream fis = new FileInputStream("Student.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);

                Student s = (Student) ois.readObject();

                System.out.println("ID: " + s.id);
                System.out.println("Name: " + s.name);
                System.out.println("Password: " + s.password);

                ois.close();
                fis.close();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found");
            }
        }
}
