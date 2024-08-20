import java.util.Scanner;

public class twodarray1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       
        System.out.println("Enter the row size:");
        int r = s.nextInt();
        System.out.println("Enter the column size:");
        int c = s.nextInt();

        int[][] a = new int[r][c];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }

        
        System.out.println("Original array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j]); 
            }
            System.out.println("  "); 
        }
    }
}
