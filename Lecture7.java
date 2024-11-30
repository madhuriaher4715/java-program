
class lecture7 extends Thread {
    public void display() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public class task2 {
        public static void main(String args[]) {
            lecture7 obj = new lecture7();
            obj.display();
        }
    }
}
