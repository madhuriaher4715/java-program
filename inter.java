interface Interfa1 {
    void add();

    void display();
}

class Interfa2 implements Interfa1 {
    int a = 10, b = 20;

    @Override
    public void add() {
        System.out.println("Addition of two numbers: " + (a + b));
    }

    @Override
    public void display() {
        System.out.println("The result is: " + (a + b));
    }
}

public class inter {
    public static void main(String[] args) {
        Interfa2 obj = new Interfa2();
        obj.add();
        obj.display();
    }
}
