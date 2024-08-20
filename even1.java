import java.util.Scanner;
class even1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = s.nextInt();
        int []a =  new int [n];
        System.out.println("enter the array elements: ");
        for( int i = 0; i < n ; i ++){
        a[i] = s.nextInt();
        }
        System.out.println("even number in an array:");
        for( int i = 0; i < n; i ++)
        {
            if (a[i] % 2 == 0){
                System.out.println(a[i]);
            }
        }



    }
}