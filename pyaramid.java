public class pyaramid {
    public static void main(String[] args) {
        int n = 5; 
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int c = 0; c < 2 * i + 1; c++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
