import java.util.Scanner;
public class mult {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int product = 1;
        System.out.println("enter the size of array:");
        int n = s.nextInt();
         int []a = new int[n];
         
            System.out.println("enter the array elements:");
            for( int i =0; i < n; i ++){
            a[i] = s.nextInt();
             
         }
         System.out.println("product of array elements:" + product);

         }
    }
    

