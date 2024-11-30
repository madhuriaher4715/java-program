public class inca {
    private String holdername = "abhi";
    private int accountnumber = 1;

    void display() {
        System.out.println("employee name " + holdername);
        System.out.println("employee id" + accountnumber);
    }

    public static void main(String[] args) {
        inca obj = new inca();
        obj.display();
    }
}
