
//Create Objects of a Class: Write a program to create three objects of the Student class, 
//each representing a different student with attributes name and rollNumber.
import java.util.Scanner;

public class stt {
    String name;
    int id;

    void accept() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the student name");
        name = s.next();
        System.out.println("enter the employee id");
        id = s.nextInt();
    }

    void display() {
        System.out.println("student name" + name);
        System.out.println("student id" + id);
    }

}

class sss {
    public static void main(String[] args) {
        stt obj = new stt();
        stt obj1 = new stt();
        stt obj2 = new stt();
        obj.accept();
        obj1.accept();
        obj2.accept();
        obj1.display();
        obj.display();
        obj2.display();
    }
}
