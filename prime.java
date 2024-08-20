import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
    
        int n = sc.nextInt();
        if ( n % 2 == 0){
            System.out.println(n + " it's  prime number");
        }else{
        System.out.println(n  + " is  not prime number");
        }
        }

    }

