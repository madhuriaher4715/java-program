public class inher1 {// inheritance

    int a;

    void accept() {
        System.out.println("display a" + a);
    }
}

class inher2 extends inher1 {
    int age = 20;

    void display() {
        System.out.println("age of employee" + age);
    }
}

class main {
    public static void main(String[] args) {
        inher2 obj = new inher2();
        obj.accept();
        obj.display();

    }

}
