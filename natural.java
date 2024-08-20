import java.util.Scanner;

class practice {
    public static void main(String[] args) {
       
        int i = 1;
        int sum = 0;
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter any positive number:");
        int n = scanner.nextInt();
        
       
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            
            while (i <= n) {
                sum += i;
                i++;
            }
            
            System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
        }
        
        
    }
}
