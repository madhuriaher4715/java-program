class nest {
    int s;

    nest(int s1) {
        s = s1;
    }

    void display() {
        System.out.println("calculate area of" + (s * s));
    }
}

class demo1 {
    public static void main(String[] args) {
        nest obj = new nest(10);
        obj.display();
    }
}