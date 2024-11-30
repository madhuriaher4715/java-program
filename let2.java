import java.util.Scanner;

public class let2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the size of array elements");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter the  array elements");
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        System.out.println("array elements are");
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
        for(int i=0; i<n; i++){
            if (a[i]% 2==0){
         sum =sum + a[i];
        }
         
        }  
        System.out.print("addition "+sum);  
    }
}

