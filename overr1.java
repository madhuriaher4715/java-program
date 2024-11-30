class overr1 { // method overloading
    void display() {
        System.out.println("Display with no parameters");
    }

    void display(int x) { // Method with one int parameter
        System.out.println("Display with one parameter: " + x);
    }

    void display(String name, int age) { // Method with two parameters
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        overr1 obj = new overr1();
        obj.display(); // Calls display() with no parameters
        obj.display(25); // Calls display() with one int parameter
        obj.display("John", 30); // Calls display() with two parameters
    }
}
