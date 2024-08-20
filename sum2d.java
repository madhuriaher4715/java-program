import java.util.Scanner;
class sum2d{
    public static void main(String[] args) {
        int a[][]= new  int [2][2];
        int b[][]= new int [2][2];
        int c[][]= new int [2][2];
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter first rows and col:");
        for( int i=0; i<2; i++){
            for( int j=0; j<2; j++){
              a[i][j]=s.nextInt();
            }
        }
        System.out.println("enter second rows and col:");
        for( int i=0; i<2; i++){
            for( int j=0; j<2; j++){
              b[i][j]=s.nextInt();
            }
        }
        
        for( int i=0; i<2; i++){
            for( int j=0; j<2; j++){
                c[i][j]=a[i][j]+b[i][j];
              
            }
        }
        System.out.println("Addition:");
        for( int i=0; i<2; i++){
            for( int j=0; j<2; j++){
             System.out.print(c[i][j]);
            }
            System.out.println(" ");
        }
        
    }
}
