import java.util.Scanner;

class overr { // polymorphism method overriding
    int rollno;
    String name;

    void accept() {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the employee rollno");
        rollno = s.nextInt();
        s.nextLine();
        System.out.println("enter the employee name");
        name = s.nextLine();

    }

    void display() {
        System.out.println("employee rollno" + rollno);
        System.out.println("employee name" + name);
    }
}

class inn extends overr {
    String hist;

    void accept() {

        Scanner s = new Scanner(System.in);
        super.accept();
        System.out.println("enter the employee hist");
        hist = s.nextLine();

    }

    void display() {
        super.display();
        System.out.println("employee historic");
    }

    public static void main(String[] args) {
        inn obj = new inn();
        obj.accept();
        obj.display();

    }
}
