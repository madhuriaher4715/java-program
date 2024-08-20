import java.util.Scanner;
public class sum {
    int add(int a, int b){
       int add = a + b;
       return add;
    }
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         sum n = new sum ();
         //System.out.println("addition:" + n.add(5,3));
         System.out.println("enter the first number:");
         int a = s.nextInt();
         System.out.println("enter the second number");
         int b = s.nextInt();
         System.out.println("addition:" + n.add(a,b));
    }
    
}
