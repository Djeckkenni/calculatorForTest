public class Main {
    public static void main(String[] args) {
        int result = 0;
        Calculator calculator = new Calculator();
        int number1 = calculator.getInt();
        System.out.printf("number1 = %d\n", number1);
        int number2 = calculator.getInt();
        System.out.printf("number2 = %d\n", number2);
        char operation = calculator.getOperation();
        System.out.printf("operation = %s\n", operation);
        switch (operation) {
            case '+':
                Operation sum = calculator.sum(operation);
                result = sum.operation(number1, number2);
                break;
            case '-':
                Operation sub = calculator.sub(operation);
                result = sub.operation(number1, number2);
                break;
            case '*':
                Operation multiply = calculator.multiply(operation);
                result = multiply.operation(number1, number2);
                break;
            case '/':
                Operation divide = calculator.divide(operation);
                result = divide.operation(number1, number2);
                break;
            case '^':
                Operation exponent = calculator.exponent(operation);
                result = exponent.operation(number1, number2);
                System.out.printf("result %d %s %d = %d", number1, operation, number2, result);
                break;
            default:
                System.out.println("Ooops!");
        }
    }
}
