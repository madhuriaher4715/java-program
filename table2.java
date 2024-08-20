import java.util.Scanner;
class table2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter the number for multiplication");
        int n = scanner.nextInt();
        
        int i = 1;
        do{
            System.out.println( n  + " x " + i +  " = " + (n * i));
            i++;
        }while( i <= 10);
    }
}