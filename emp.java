//Classes: Patient, Doctor, Appointment

import java.util.Scanner;

public class emp {
    String hname;
    String hadd;

}

class patient extends emp {
    String name;
    int id;
    String address;

    void accept() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the patient name");
        name = s.next();
        System.out.println("enter the patient id");
        id = s.nextInt();
        System.out.println("enter the patient address");
        address = s.next();
    }

    void display() {
        System.out.println("patient name" + name);
        System.out.println("patient id" + id);
        System.out.println("patient address" + address);
    }
}

class doctor extends patient {
    String dname;
    String address1;
    String specialty;

    void accept1() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the doctor name");
        dname = s.next();
        System.out.println("enter the doctor address");
        address1 = s.next();
        System.out.println("enter the doctor specitality");
        specialty = s.next();
    }

    void display1() {
        System.out.println("doctor name" + dname);
        System.out.println("doctor address" + address1);
        System.out.println("docotor speciality" + specialty);
    }

}

class task {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        patient obj = new patient();
        obj.accept();
        obj.display();
        doctor obj2 = new doctor();
        obj2.accept1();
        obj2.display1();

    }
}
