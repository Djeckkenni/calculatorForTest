import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public int getInt() {
        System.out.println("Enter number:");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Wrong value. Please, enter number: ");
            scanner.next();
            number = getInt();
        }
        return number;
    }

    public char getOperation() {
        System.out.println("Enter operation \"+\",\"-\", \"*\", \"/\", \"^\":");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*'
                    || operation == '/' || operation == '^') {
                return operation;
            } else {
                operation = getWrongValue();
            }
        } else {
            operation = getWrongValue();
        }
        return operation;
    }

    private char getWrongValue() {
        System.out.println("Wrong value. Enter operation:");
        scanner.next();
        char operation = getOperation();
        return operation;
    }

    public Operation sum(char operation) {
        return (a, b) -> a + b;
    }

    public Operation sub(char operation) {
        return (a, b) -> a - b;
    }

    public Operation multiply(char operation) {
        return (a, b) -> a * b;
    }

    public Operation divide(char operation) {
        return (a, b) -> a / b;
    }

    public Operation exponent(char operation) {
        return (a, b) -> (int) Math.pow(a, b);
    }
}
