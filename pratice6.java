import java.util.Scanner;
class pratice6{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("enter the size of rows:");
        int r = s.nextInt();
        System.out.println("enter the size of col:");
        int c = s.nextInt();

        int a[][]= new int[r][c];

        System.out.println("enter the row and col array elements:");
        for(int i = 0; i< r; i++){
            for(int j = 0; j< c; j++){
                a[i][j]= s.nextInt();
            }
        }
      System.out.println("display:");
        for(int i = 0; i< r; i++){
            for(int j = 0; j< c; j++){
            System.out.print(a[i][j]);
      
        }
        System.out.println("  "); 
    }
    }


    }

    
    