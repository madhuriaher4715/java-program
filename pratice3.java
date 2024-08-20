import java.util.Scanner;

class Practice3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the size of array:");
        int n = s.nextInt();
        int [] a = new int[n];
        
        System.out.println("enter the array elements:");
        for( int i = 0; i < n; i ++){
            a[i] = s.nextInt();
        }
        System.out.println("array elements are:");
        for(int i = n-1; i >= 0; i --)
        {
            System.out.println(a[i]);
        }
        for(int i = 0; i < n; i ++)
        {
            sum += a[i];
        }
            System.out.println("sum of array elements  =  "  + sum);
        
        

    }
        }
        
        
        
    

