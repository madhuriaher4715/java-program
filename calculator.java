import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        double number1, number2, result;
        
        do {
            System.out.println("Enter first number: ");
            number1 = scanner.nextDouble();
            
            System.out.println("Enter operator (+, -, *, /): ");
            operator = scanner.next().charAt(0
            );
            
            System.out.println("Enter second number: ");
            number2 = scanner.nextDouble();
            
            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 / number2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
            }
            
            System.out.println("Do you want to perform another calculation? (y/n): ");
        } while (scanner.next().charAt(0) == 'y');
        
        System.out.println("calculator program ended.");
    }
}

