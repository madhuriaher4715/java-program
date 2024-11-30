
import java.util.Scanner;

public  class incap{
    private int id;

class incap1{
    void accept(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the id");
        id=s.nextInt();
    }
    void display(){
        System.out.println("it's my first incapsulation program");
        System.out.println("it's our employee id"+id);
    }
}
public static void main(String[] args) {
    incap obj=new incap();
    incap.incap1 obj2=obj.new incap1();
    obj2.accept();
    obj2.display();
}
}