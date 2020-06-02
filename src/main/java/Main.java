import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int result = 0;
        Calculator calculator = new Calculator();
        int number1 = getInt();
        System.out.printf("number1 = %d\n", number1);
        int number2 = getInt();
        System.out.printf("number2 = %d\n", number2);
        char operation = getOperation();
        System.out.printf("operation = %s\n", operation);
        switch (operation) {
            case '+':
                Operation sum = calculator.sum();
                result = sum.operation(number1, number2);
                System.out.printf("result %d %s %d = %d", number1, operation, number2, result);
                break;
            case '-':
                Operation sub = calculator.sub();
                result = sub.operation(number1, number2);
                System.out.printf("result %d %s %d = %d", number1, operation, number2, result);
                break;
            case '*':
                Operation multiply = calculator.multiply();
                result = multiply.operation(number1, number2);
                System.out.printf("result %d %s %d = %d", number1, operation, number2, result);
                break;
            case '/':
                Operation divide = calculator.divide();
                result = divide.operation(number1, number2);
                System.out.printf("result %d %s %d = %d", number1, operation, number2, result);
                break;
            case '^':
                Operation exponent = calculator.exponent();
                result = exponent.operation(number1, number2);
                System.out.printf("result %d %s %d = %d", number1, operation, number2, result);
                break;
            default:
                System.out.println("Ooops!");
        }
    }

    public static int getInt() {
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

    public static char getOperation() {
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

    private static char getWrongValue() {
        System.out.println("Wrong value. Enter operation:");
        scanner.next();
        char operation = getOperation();
        return operation;
    }
}
