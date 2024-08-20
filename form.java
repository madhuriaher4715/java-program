import java.util.Scanner;

public class form {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of people:");
        int n = s.nextInt();
        s.nextLine();

        String[] names = new String[n];

        System.out.println("Enter the names of " + n + " people:");
        for (int i = 0; i < n; i++) {
            names[i] = s.nextLine();
        }

        System.out.println("\nEntered names:");
        for (int i = 0; i < n; i++) {
            System.out.println("Name  " + names[i]);
        }

    }
}
